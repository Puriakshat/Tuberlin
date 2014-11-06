package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;

public class Assignment1 {
    
    public HashMap integerAndChain = new HashMap();
    public String dataToSend;
    public Socket sock;
    
    public class handleClient implements Runnable {
        
        public BufferedReader reader;
        public InputStreamReader inStream;
        public OutputStreamWriter os;
        private final char[] charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        private final int minimum = 10;
        private final int maximum = 20;

        public handleClient() {
            try {
                inStream = new InputStreamReader(sock.getInputStream());       
                reader = new BufferedReader(inStream); 
                os = new OutputStreamWriter(sock.getOutputStream());
            } catch (IOException ex) {
                //otro logger por aqui
            }
        }

        @Override
        public void run() {
            try {
                String dataReceived = receiveValue();   
                
                if(isNumber(dataReceived)){
                    System.out.println("Connecting to " + sock.getInetAddress().toString());
                    String firstValue = createStringChainAndAddToMap(dataReceived);
                    System.out.println("I send to the client: " + firstValue);
                    sendValue(firstValue);
                    sock.close();
                    inStream.close();
                    reader.close();                  
                }else{
                    dataReceived = parseDataReceived(dataReceived);
                    System.out.println("I receive from the client: "+ dataReceived);
                    if(testAuthMessage(dataReceived))
                        sendValue("OK");
                    else
                        sendValue("FAIL");
                    sock.close();
                    inStream.close();
                    reader.close();
                }
                
            } catch (IOException ex) {
            } 
        }
        
        private void sendValue(String value) throws IOException{           
            os.write(value);
            os.close();  
        }
        
        private String receiveValue()throws IOException{
            char[] buffer = new char[400];
            int count = reader.read(buffer, 0, 300);
            return (new String(buffer, 0, count));
        }
        
        private String createStringChainAndAddToMap(String binaryValue){
            int decimalValue = Integer.parseInt(binaryValue, 2);
            int sizeOfRegex = getRandomNumber();
            String regex = createRegex(sizeOfRegex);
            dataToSend = regex; //this is for the JUNIT tests
            putDataReceivedInMap(regex, decimalValue);
            return ((decimalValue + 1) + " " + regex+"\n");
        }
        
        private void putDataReceivedInMap(String regex, int decimalValue){
            integerAndChain.put(regex, decimalValue + 1);
        }
        
        private int getRandomNumber(){
            return (maximum - ((int) (minimum * Math.random())));
        }
        
        private String createRegex(int length) {
            Random random = new SecureRandom();
            char[] result = new char[length];
            for (int i = 0; i < result.length; i++) {
                int randomCharIndex = random.nextInt(charSet.length);
                result[i] = charSet[randomCharIndex];
            }
            return new String(result);
        }
        
        private String upperToLowerAndLowerToUpper(String original){
            String changed;
            char[]regexChars = original.toCharArray();
            char[]newRegexChars = new char[regexChars.length];
            for(int i=0 ; i<regexChars.length ; i++){
                if(Character.isLowerCase(regexChars[i]))
                    newRegexChars[i] = Character.toUpperCase(regexChars[i]);
                else if(Character.isUpperCase(regexChars[i]))
                    newRegexChars[i] = Character.toLowerCase(regexChars[i]);
                else
                    newRegexChars[i] = regexChars[i]; 
            }
            changed = String.valueOf(newRegexChars);
            return changed;
        }
        
        private String parseDataReceived(String dataReceived){
            return dataReceived.split("\n")[0];
        }
        
        private boolean testAuthMessage(String dataReceived){
            if(dataReceived.split(" ").length != 2)
                return false;
            
            String convertedReceivedRegex = upperToLowerAndLowerToUpper(dataReceived.split(" ")[1]);
            int receivedInteger = Integer.parseInt(dataReceived.split(" ")[0]);
            
            if(integerAndChain.containsKey(convertedReceivedRegex)){
                int valueOfRegex = (Integer)integerAndChain.get(convertedReceivedRegex);
                if(valueOfRegex == receivedInteger){
                    integerAndChain.remove(convertedReceivedRegex);
                    return true;
                }
            }
            return false;
        }
        
    }
    
    
    public static void main(String[] args) {
        new Assignment1().startServer();
    }

    public void startServer() {
        try {
            //ServerSocket serverSock = new ServerSocket(22011);
            ServerSocket serverSock = new ServerSocket(22011, 0, InetAddress.getByName("localhost"));
            System.out.println("Waiting for client");

            while (true) {
                sock = serverSock.accept();
                new Thread(new handleClient()).start();
            }
        } catch (IOException ex) {
            //logger information
        }

    }
    
    private boolean isNumber(String dataReceived){
        boolean isNumber = true;
        try{
            Integer.parseInt(dataReceived);
        }catch(java.lang.NumberFormatException ex){
            isNumber = false;
        }
        return isNumber;
    }
}
