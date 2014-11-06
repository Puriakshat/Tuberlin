package client;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import de.tu_berlin.kbs.mwk.test.TestObject;

public class Client {

    private final int port = 22011;

    public void startClient() {
        //The client will call several jobs to be executed
        try {
            testHelloWorldAnnotated();
            sleep();
            testObject();
            sleep();
            testHelloWorld();
            sleep();
            testEcho();
            sleep();
            testEcho2();
            sleep();
            testAnotated();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void testHelloWorldAnnotated() throws IOException {
        System.out.println("[CLIENT]\t 1st test: HelloWorld");
        File helloWorld = new File("./de/tu_berlin/kbs/mwk/test/TestHelloWorld.class");
        String methodName = "none";
        Socket socket = new Socket("127.0.0.1", port);
        new ServerRequest(helloWorld, null, methodName, null, socket).start();
        System.out.println("\n\n");
    }

    private void testObject() throws IOException {
        System.out.println("[CLIENT]\t 2nd test: sending an object and src code");
        File testObject = new File("./de/tu_berlin/kbs/mwk/test/TestObject.java");
        String methodName = "increaseParams";
        TestObject objectToTest = new TestObject();
        System.out.println(objectToTest.toString());
        Socket socket = new Socket("127.0.0.1", port);
        ServerRequest srv = new ServerRequest(testObject, objectToTest, methodName, null, socket);
        srv.start();
        System.out.println("[CLIENT]\t Object sent to server");
        objectToTest = (TestObject) srv.getObject();
        System.out.println(objectToTest.toString());
        System.out.println("\n\n\n");
    }

    private void testHelloWorld() throws IOException {
        System.out.println("[CLIENT]\t 3rd test: HelloWorld");
        File helloWorld = new File("./de/tu_berlin/kbs/mwk/test/HelloWorld.class");
        String methodName = "helloWorld";
        Socket socket = new Socket("127.0.0.1", port);
        new ServerRequest(helloWorld, null, methodName, null, socket).start();
        System.out.println("\n\n");
    }

    
    private void testEcho() throws IOException {
        System.out.println("[CLIENT]\t 4thtest: HelloWorld");
        File helloWorld = new File("./de/tu_berlin/kbs/mwk/test/Echo.class");
        Object[]parameters = new Object[]{"echoTest"};
        String methodName = "echo";
        Socket socket = new Socket("127.0.0.1", port);
        new ServerRequest(helloWorld, null, methodName, parameters, socket).start();        
        System.out.println("\n\n");
    }
    
    private void testEcho2()throws IOException{
        System.out.println("[CLIENT]\t 5thtest: HelloWorld");
        File helloWorld = new File("./de/tu_berlin/kbs/mwk/test/Echo.class");
        String methodName = "echo";
        Object[] parameters = new Object[]{"echoTest",2};
        Socket socket = new Socket("127.0.0.1", port);
        new ServerRequest(helloWorld, null, methodName, parameters, socket).start();
        System.out.println("\n\n");
    }
    
    private void testAnotated() throws IOException{
        System.out.println("[CLIENT]\t 6thtest: Annotated");
        File helloWorld = new File("./de/tu_berlin/kbs/mwk/test/Annotated.class");
        String methodName = "none";
        Socket socket = new Socket("127.0.0.1", port);
        new ServerRequest(helloWorld, null, methodName, null, socket).start();
        System.out.println("\n\n");  
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Client().startClient();
    }
}
