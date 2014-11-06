
import com.chaosinmotion.asn1.BerInputStream;
import com.chaosinmotion.asn1.BerOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;

public class MwC_Assignment2 {

    public HashMap integerAndChain = new HashMap();
    public String dataToSend;
    public Socket sock;
    public static int printHex ;

    public class handleClient implements Runnable {

        //public InputStreamReader inStream;
        private DataOutputStream os;
        private final char[] charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        private final int minimum = 10;
        private final int maximum = 20;
        private DataInputStream in;
        private ClientServer ASNReceived;

        public handleClient() {

            try {
                in = new DataInputStream(sock.getInputStream());
                os = new DataOutputStream(sock.getOutputStream());
            } catch (IOException ex) {
            }
        }

        @Override
        public void run() {
            try {
                System.out.println("Connecting to " + sock.getInetAddress().toString());
                
                /*Receive the binary number*/
                this.ASNReceived = receiveValue();
                int binaryRcvd = (int) ASNReceived.binaryCodedInteger.getValue();
                System.out.println("1st: I receive from the client: "+binaryRcvd );
                
                /*Convert it to decimal and add the regex chain*/
                int decimalRcvd = binaryToDecimal(binaryRcvd);
                String regexToSend = createStringChain();
                
                /*Send the regex Chain and the decimal number*/
                System.out.println("\n2nd: I send to the client: " + (decimalRcvd+1) +" " + regexToSend );
                sendValue(decimalRcvd+1 , regexToSend);
                
                /*Receive the chain*/
                this.ASNReceived = receiveValue();
                String newregexToSend = ASNReceived.randomStringOrVerification.getValue();
                System.out.println("\n3rd: I receive from the client: " + newregexToSend);
                
                /*Check if it's correct*/
                if (newregexToSend.equals(upperToLowerAndLowerToUpper(regexToSend))) {
                    System.out.println("\nI send an OK");
                    sendValue(0, "OK");
                } else {
                    System.out.println("\nI send a FAIL");
                    sendValue(0, "FAIL");
                }
                System.out.println("\n\n\n");
                os.close();
                in.close();
                sock.close();

            } catch (IOException ex) {
            }

        }

        private void sendValue(int firstNumber, String value) throws IOException {
            byte[] output;
            ClientServer cls = fillASN(firstNumber, value);
            ByteArrayOutputStream stream = encodeASN(cls);
            output = stream.toByteArray();
            printHex(output);
            os.write(output);
            os.flush();
        }

        private ClientServer fillASN(int firstNumber, String value) {
            ClientServer clientServer = new ClientServer();
            clientServer.binaryCodedInteger.setValue(firstNumber);
            clientServer.randomStringOrVerification.setValue(value);
            return clientServer;
        }

        private ByteArrayOutputStream encodeASN(ClientServer cls) throws IOException {
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            BerOutputStream out = new BerOutputStream(stream);
            cls.encode(out);
            return stream;
        }

        private ClientServer receiveValue() {
            try {
                byte[] buffer = new byte[64];
                ClientServer cls = decodeStreamReceived(buffer);
                return cls;
            } catch (IOException ex) {
            }
            return null;
        }

        private ClientServer decodeStreamReceived(byte[] inputMessage)
                throws IOException {
            in.read(inputMessage);
            printHex(inputMessage);
            ByteArrayInputStream ba = new ByteArrayInputStream(inputMessage);
            BerInputStream msgIn = new BerInputStream(ba);
            ClientServer cls = new ClientServer();
            cls.decode(msgIn);

            return cls;
        }

        public void printHex(byte[] coded) {
	    if(printHex == 0)
		return;
            String hexDigits = "0123456789ABCDEF";
            System.out.println("Data in hexadecimal: ");
            for (int i = 0; i < coded[1] + 2; i++) {
                int c = coded[i];
                if (c < 0) {
                    c += 256;
                }
                int hex1 = c & 0xF;
                int hex2 = c >> 4;
                System.out.print(hexDigits.substring(hex2, hex2 + 1));
                System.out.print(hexDigits.substring(hex1, hex1 + 1) + " ");
            }
            System.out.println("");
        }

        private String createStringChain() {
            int sizeOfRegex = getRandomNumber();
            String regex = createRegex(sizeOfRegex);
            dataToSend = regex; //this is for the JUNIT tests
            return regex;
        }

        private int binaryToDecimal(int binaryNumber) {
            char[] binaryArray = ("" + binaryNumber).toCharArray();
            int result = 0;
            
            for (int i = binaryArray.length - 1; i >= 0; i--) {
                int value = Character.getNumericValue(binaryArray[i]);
                result += Math.pow(2 * value, binaryArray.length - i - 1);
            }
            return result;
        }

        private int getRandomNumber() {
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

        private String upperToLowerAndLowerToUpper(String original) {
            String changed;
            char[] regexChars = original.toCharArray();
            char[] newRegexChars = new char[regexChars.length];
            for (int i = 0; i < regexChars.length; i++) {
                if (Character.isLowerCase(regexChars[i])) {
                    newRegexChars[i] = Character.toUpperCase(regexChars[i]);
                } else if (Character.isUpperCase(regexChars[i])) {
                    newRegexChars[i] = Character.toLowerCase(regexChars[i]);
                } else {
                    newRegexChars[i] = regexChars[i];
                }
            }
            changed = String.valueOf(newRegexChars);
            return changed;
        }

        private boolean testAuthMessage(String dataReceived) {
            if (dataReceived.split(" ").length != 2) {
                return false;
            }

            String convertedReceivedRegex = upperToLowerAndLowerToUpper(dataReceived.split(" ")[1]);
            int receivedInteger = Integer.parseInt(dataReceived.split(" ")[0]);

            if (integerAndChain.containsKey(convertedReceivedRegex)) {
                int valueOfRegex = (Integer) integerAndChain.get(convertedReceivedRegex);
                if (valueOfRegex == receivedInteger) {
                    integerAndChain.remove(convertedReceivedRegex);
                    return true;
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {
	printHex = Integer.parseInt(args[0]);
        new MwC_Assignment2().startServer();
    }

    public void startServer() {
        try {
            ServerSocket serverSock = new ServerSocket(22011);
            //ServerSocket serverSock = new ServerSocket(22011, 0, InetAddress.getByName("localhost"));
            System.out.println("Waiting for client");

            while (true) {
                sock = serverSock.accept();
                new Thread(new handleClient()).start();
            }
        } catch (IOException ex) {
            //logger information
        }

    }

}
