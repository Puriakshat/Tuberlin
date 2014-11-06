package StockPublisher;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;


public class PublishQuote {

    private final TopicSession topicSession;
    private final String subject;
    private TextMessage message;
    private TopicPublisher topicPublisher;

    public PublishQuote(TopicSession topicSession, String subject) {
        this.topicSession = topicSession;
        this.subject = subject;
        createTopic();
    }

    private void createTopic() {
        try {
            Topic topic = topicSession.createTopic(subject);
            topicPublisher = topicSession.createPublisher(topic);
            message = topicSession.createTextMessage();
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }

    protected void publishQuote(double quote, String content) throws JMSException {
        message.setText(content);
        message.setDoubleProperty("quote", quote);
        topicPublisher.publish(message);
    }
}
