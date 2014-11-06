package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final ServerSocket serverSocket;
    private final int port = 22011;

    public Server() throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void startServer() throws IOException {
        while(true){
            System.out.println("[SERVER] Waiting for client");
            Socket socket = serverSocket.accept();
            System.out.println("[SERVER] Connected to " + socket.getInetAddress());
            new RequestContainer(socket).start();
        }
    }
    
    public static void main(String[]args){
        try{
            new Server().startServer();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
