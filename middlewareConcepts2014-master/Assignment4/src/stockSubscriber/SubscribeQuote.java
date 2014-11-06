package stockSubscriber;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jms.*;

public class SubscribeQuote implements MessageListener, Serializable {

    private final String subject;
    protected transient TopicSession topicSession;
    protected transient QueueSession queueSession;
    private transient Topic topic;
    private transient TopicSubscriber topicSubscriber;

    private boolean printInfo;

    //StockQuote Parameters
    private Date stockQuoteInstant;
    private double stockQuoteValue;
    private boolean odd = true;

    public SubscribeQuote(String subject, TopicSession topicSession, QueueSession queueSession) {
        this.subject = subject;
        this.topicSession = topicSession;
        this.queueSession = queueSession;
        
        this.printInfo = false;
    }

    public void setupSubscribeQuote() {
        try {
            createTopic();
            topicSubscriber.setMessageListener(this);
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }

    private void createTopic() throws JMSException {
        topic = topicSession.createTopic(subject);
        topicSubscriber = topicSession.createSubscriber(topic);
    }

    public void fastInit() {
        try {
            Destination dest = queueSession.createQueue("messageRequest");
            MessageConsumer responseConsumer = queueSession.createConsumer(dest);

            responseConsumer.setMessageListener(this);
            TextMessage tempTxt = queueSession.createTextMessage();
            tempTxt.setText(subject);
            tempTxt.setJMSReplyTo(dest);
            
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }


    @Override
    public void onMessage(Message message) {
        TextMessage textMsg;
        String temp;
        if (message instanceof TextMessage) {
            textMsg = (TextMessage) message;
            try {
                temp = textMsg.getText();
                parseMessage(temp);

                if (this.printInfo & odd) {
                    System.out.print("\n [Subscriber] " + subject + "\n\t\t");
                    System.out.printf("%.2f", stockQuoteValue);
                    System.out.println("\t\t| " + stockQuoteInstant);
                    
                }
                odd = !odd;

            } catch (JMSException ex) {
                System.err.println(ex);
            }
        }

    }

    public void parseMessage(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        String[] messageContent;

        try {
            messageContent = msg.split(":");
            stockQuoteInstant = dateFormat.parse(messageContent[1]);
            stockQuoteValue = Float.parseFloat(messageContent[0]);
        } catch (ParseException ex) {
            System.err.println(ex);
        }

    }

    public String getSubject() {
        return this.subject;
    }

    public void setPrint(boolean printInfo) {
        this.printInfo = printInfo;
    }

    public boolean getPrint() {
        return this.printInfo;
    }

    public void closeTopicSubscriber() {
        try {
            this.topicSubscriber.close();
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }
}
