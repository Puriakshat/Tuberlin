package middleware_assignment4;


public class Middleware_Assignment4 {

  

    public static void main(String[] args) {
        switch (args[0]) {
            case "publish":
                new StockPublisher.StockPublisher().startPublish();
                break;
            case "subscribe":
                new stockSubscriber.StockSubscriber().startSubscriber();
                break;
            default:
                System.out.println("\n\n[publish/subscribe] needed as an argument.\n\n"
                        + "\n\nAborting execution...\n\n");
                System.exit(-1);
        }
    }

}
