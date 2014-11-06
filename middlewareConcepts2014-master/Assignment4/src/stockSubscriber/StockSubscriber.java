package stockSubscriber;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class StockSubscriber {

    private static TopicSession stockSubscribeSession;
    private static QueueSession stockInitSession;
    private static TopicConnection topicConn;
    private static QueueConnection queueConn;
    private static final String url = ActiveMQConnection.DEFAULT_BROKER_URL;

    private List<SubscribeQuote> quotesSubscribed = new ArrayList<>();

    public StockSubscriber() {
        try {
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
            topicConn = connectionFactory.createTopicConnection();
            queueConn = connectionFactory.createQueueConnection();
            topicConn.start();
            queueConn.start();
            stockSubscribeSession = topicConn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            stockInitSession = queueConn.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }

    public void startSubscriber() {
        String commandIntroduced;
        initAndDeserialize();
        Console cos = System.console();
        while (true) {
            commandIntroduced = cos.readLine("Command>> ");

            if (commandIntroduced.equals("add")) {
                String idOfStock = cos.readLine("Introduce ID of stok to add>> ");
                try {
                    addNewStock(idOfStock);
                } catch (StockAlreadyExistsException ex) {
                    System.out.println("Already subscribed to that quote");
                }
            } else if (commandIntroduced.equals("remove")) {
                String idOfStock = cos.readLine("Introduce ID of stok to remove>> ");
                try {
                    removeStock(idOfStock);
                } catch (StockDoesNotExistException ex) {
                    System.out.println(ex);
                }
            } else if (commandIntroduced.equals("print")) {
                for (SubscribeQuote quote : quotesSubscribed) {
                    quote.setPrint(!quote.getPrint());
                }
            } else if (commandIntroduced.equals("exit")) {
                System.out.println("serializing stocks... ");
                exitAndSerialize();
            } else {
                System.out.println("Command not recognized. Commands accepted:\n\n"
                        + "[add/remove/print/exit]\n\n");
            }
        }
    }

    private void addNewStock(String stockId) throws StockAlreadyExistsException {
        for (SubscribeQuote subscription : quotesSubscribed) {
            if (subscription.getSubject().equals(stockId)) {
                throw new StockAlreadyExistsException("Stock already in watchlist");
            }
        }
        SubscribeQuote subscribeQuote = new SubscribeQuote(stockId, stockSubscribeSession, stockInitSession);
        quotesSubscribed.add(subscribeQuote);

        subscribeQuote.fastInit();

        subscribeQuote.setupSubscribeQuote();
    }

    private void removeStock(String stockId) throws StockDoesNotExistException {
        Object[] x = quotesSubscribed.toArray();
        for (Object x1 : x) {
            SubscribeQuote subscription = (SubscribeQuote) x1;
            if (stockId.equals(subscription.getSubject())) {
                subscription.closeTopicSubscriber();
                quotesSubscribed.remove(subscription);
                return;
            }
        }
        throw new StockDoesNotExistException("Not subscribed to this quote");
    }

    private void exitAndSerialize() {
        try (
                FileOutputStream fs = new FileOutputStream("serialize.ser");
                ObjectOutputStream os = new ObjectOutputStream(fs);) {
                os.writeObject(quotesSubscribed);
        } catch (IOException ex) {
            System.err.println("Nothing to serialize");
        }
        System.exit(0);
    }

    private void initAndDeserialize() {
        try (FileInputStream fileIn = new FileInputStream("serialize.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);) {

            quotesSubscribed = (ArrayList<SubscribeQuote>) in.readObject();
            for (SubscribeQuote quote : quotesSubscribed) {
                quote.topicSession = stockSubscribeSession;
                quote.queueSession = stockInitSession;
                quote.fastInit();
                quote.setupSubscribeQuote();
            }
        } catch (java.io.IOException | ClassNotFoundException ex) {

        }
    }

    private class StockAlreadyExistsException extends Exception {

        private StockAlreadyExistsException(String message) {
            super(message);
        }
    }

    private class StockDoesNotExistException extends Exception {

        private StockDoesNotExistException(String message) {
            super(message);
        }
    }
}
