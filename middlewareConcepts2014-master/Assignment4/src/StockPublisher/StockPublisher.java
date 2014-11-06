package StockPublisher;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import stock.Stock;

public class StockPublisher implements MessageListener {

    private static String url;
    private static TopicSession stockPublishSession;
    private static QueueSession stockInitSession;
    private static TopicConnection topicConn;
    private static QueueConnection queueConn;

    private final String messageRequest = "messageRequest";
    private MessageProducer messageProducer;

    private final List<QuoteUpdater> updateThreadsList;
    private final List<Stock> companies;

    public StockPublisher() {

        updateThreadsList = new ArrayList<>();
        companies = getCompaniesList();

        try {
            url = ActiveMQConnection.DEFAULT_BROKER_URL;
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
            topicConn = connectionFactory.createTopicConnection();
            queueConn = connectionFactory.createQueueConnection();
            topicConn.start();
            queueConn.start();
            stockPublishSession = topicConn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            stockInitSession = queueConn.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }

    public void startPublish() {
        for (Stock stock : companies) {
            QuoteUpdater quoteUpdater = new QuoteUpdater(stock, stockPublishSession);
            updateThreadsList.add(quoteUpdater);
            quoteUpdater.start();
        }

        try {

            Destination requestQueue = stockInitSession.createQueue(messageRequest);
            messageProducer = stockInitSession.createProducer(null);
            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            MessageConsumer requestConsumer = stockInitSession.createConsumer(requestQueue);
            requestConsumer.setMessageListener(this);

        } catch (JMSException ex) {
            System.err.println(ex);
        }

    }

    private ArrayList<Stock> getCompaniesList() {
        ArrayList<Stock> daxCompanies = new ArrayList<>(30);
        Path configFile = Paths.get("../DAX/DAX.in").toAbsolutePath().normalize();
        List<String> numberOfCompanies = readAllDAXLines(configFile);

        Stock stockQ = new Stock(null, null, -1, null);
        int i = 0;

        SimpleDateFormat time = new SimpleDateFormat("yyyyMMddHHmmssz");

        for (String line : numberOfCompanies) {
            switch (i % 3) {
                case 0:
                    stockQ = new Stock(null, null, -1, null);
                    stockQ.setStockName(line);
                    break;
                case 1:
                    stockQ.setStockId(line);
                    break;
                case 2:
                    stockQ.setStockQuote(Double.parseDouble(line));
                    stockQ.setStockInstant(time.format(Calendar.getInstance().getTime()));
                    daxCompanies.add(stockQ);
                    break;
            }
            i++;
        }
        System.out.println("\nServer initialized\n");
        return daxCompanies;
    }

    private List<String> readAllDAXLines(Path configFile) {
        List<String> ans = null;
        try {
            ans = Files.readAllLines(configFile, Charset.defaultCharset());
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return ans;
    }

    @Override
    public void onMessage(Message message) {
        try {
            //Initialize the temporary queue////
            Destination tempDest = stockInitSession.createTemporaryQueue();
            MessageProducer responseConsumer = stockInitSession.createProducer(tempDest);
            ///////////////////////////////////
            TextMessage response = stockInitSession.createTextMessage();
            if (message instanceof TextMessage) {
                TextMessage txtMsg = (TextMessage) message;
                String messageText = txtMsg.getText();
                response.setText(responseMsg(messageText));
            }
            response.setJMSCorrelationID(message.getJMSCorrelationID());
            response.setJMSType("Init");
            responseConsumer.send(message.getJMSReplyTo(), response);
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }
    
    private String responseMsg(String messageText){
        String state = null;
        for(Stock s : companies){
            if(s.getStockId().equals(messageText))
                state = s.getState();
        }
        return state;
    }

    private class QuoteUpdater extends Thread {

        private final Stock stock;
        private final TopicSession topic;
        private final PublishQuote stockPublisherByName;
        private final PublishQuote stockPublisherById;

        public QuoteUpdater(Stock stock, TopicSession topic) {
            this.stock = stock;
            this.topic = topic;
            this.stockPublisherByName = new PublishQuote(this.topic, this.stock.getStockName());
            this.stockPublisherById = new PublishQuote(this.topic, this.stock.getStockId());

        }

        @Override
        public void run() {
            int timeToRefresh;
            double quoteChange;
            double currentQuoteValue;
            double newQuoteValue;
            while (true) {
                timeToRefresh = getTimeToWait();
                quoteChange = getPercentageChange();
                currentQuoteValue = stock.getStockQuote();
                newQuoteValue = (currentQuoteValue * quoteChange) + currentQuoteValue;

                SimpleDateFormat time = new SimpleDateFormat("yyyyMMddHHmmssz");

                System.out.println("\nTEST\n. time:" + timeToRefresh + "\nquote" + quoteChange + "\nvalue" + newQuoteValue
                        + "\n Name: " + stock.getStockName());

                stock.setStockQuote(newQuoteValue);
                stock.setStockInstant(time.format(Calendar.getInstance().getTime()));

                try {
                    publishQuoteToJMS(stock);
                    Thread.sleep(timeToRefresh * 1000);
                } catch (JMSException | InterruptedException ex) {
                    System.err.println(ex);
                }

            }
        }

        private void publishQuoteToJMS(Stock stockToPublish) throws JMSException {
            double tempQuote = stockToPublish.getStockQuote();
            stockPublisherById.publishQuote(tempQuote, stockToPublish.getState());
            stockPublisherByName.publishQuote(tempQuote, stockToPublish.getState());
        }

        private int getTimeToWait() {
            Random rand = new Random();
            int max = 15;
            int min = 5;
            return rand.nextInt((max - min) + 1) + min;
        }

        private double getPercentageChange() {
            double max = 0.2/100;
            double min = -0.2/100;
            double random = new Random().nextDouble();
            return (random * (max - min)) + min;
        }
    }
}
