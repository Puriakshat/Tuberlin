package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class RequestContainer extends Thread {

    private final Socket socket;
    private final long initTime;
    private String fileName;
    private String methodName;
    private long fileSize;
    private final double pricePerSecond;
    private Object object;

    private Object[] parameters;

    public RequestContainer(Socket socket) {
        this.pricePerSecond = 3.2;
        this.socket = socket;
        this.initTime = System.currentTimeMillis();
        this.object = null;
        this.parameters = null;
    }

    @Override
    public void start() {
        rcvRequest();
        Object returnValue = loadJobAndGetReturnValue();
        sendAnswerAndCloseConnection(returnValue);
    }

    private void rcvRequest() {
        try {
            ObjectInputStream objInput = new ObjectInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            this.fileName = (String) objInput.readUTF();

            if (fileName.endsWith(".class")) {
                processByteCode(objInput);
            }
            if (fileName.endsWith(".java")) {
                processSourceCode(objInput);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void processByteCode(ObjectInputStream objInput) {
        try {
            setMethodNameAndFileSize(objInput);
            writeRcvdFile(objInput);
            readObject(objInput);
            readParameters(objInput);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    private void processSourceCode(ObjectInputStream objInput) {
        try {
            setMethodNameAndFileSize(objInput);
            writeRcvdFile(objInput);
            compileJavaFile();
            readObject(objInput);
            readParameters(objInput);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    private void compileJavaFile() {
        String fileToCompile = "./de/tu_berlin/kbs/mwk/test/" + java.io.File.separator + fileName;
        try {
            new MyJavaCompiler(fileToCompile).compileFile();
        } catch (MyJavaCompiler.CompilationException ex) {
            System.err.println(ex);
        }
    }

    private void setMethodNameAndFileSize(ObjectInputStream objInput) throws IOException {
        this.fileSize = objInput.readLong();
        String thisName = objInput.readUTF();
        this.methodName = (thisName.equals("none")) ? null : thisName;
    }

    private void writeRcvdFile(ObjectInputStream objInput) throws IOException {
        try (BufferedOutputStream buffOut = new BufferedOutputStream(
                new FileOutputStream("./de/tu_berlin/kbs/mwk/test/" + fileName))) {
            System.out.println("[SERVER]: Saving file " + fileName + "....");
            for (int i = 0; i < fileSize; i++) {
                buffOut.write(objInput.read());
            }
        }
    }

    private void readObject(ObjectInputStream objInput) throws IOException, ClassNotFoundException {
        if (!objInput.readBoolean()) {
            System.out.println("[SERVER] Static Method. No instance needed.");
        } else {
            this.object = objInput.readObject();
        }
    }

    private void readParameters(ObjectInputStream objInput) throws IOException, ClassNotFoundException {
        if (objInput.readBoolean()) {
            this.parameters = (Object[]) objInput.readObject();
        }
    }

    //http://www.mkyong.com/java/how-to-use-reflection-to-call-java-method-at-runtime/
    private Object loadJobAndGetReturnValue() {
        Object ans = null;
        try {
            String className = (fileName.split(".class")[0]).split(".java")[0];
            Class jobClass = Class.forName("de.tu_berlin.kbs.mwk.test." + className);
            ans = new Job(jobClass, methodName, this.object, this.parameters).executeMethod();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
        return ans;
    }

    private void sendAnswerAndCloseConnection(Object answer) {
        try (ObjectOutputStream objOut = new ObjectOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));) {
            objOut.writeObject(answer);
            objOut.writeDouble(getBill());
            objOut.writeObject(this.object);
            objOut.flush();
            objOut.close();
            System.out.println("\n\n\n");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private double getBill() {
        double timeSpent = (double) (System.currentTimeMillis() - this.initTime) / 1000;
        return (timeSpent * this.pricePerSecond);
    }

}
