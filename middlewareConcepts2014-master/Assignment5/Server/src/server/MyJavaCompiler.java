package server;

import java.util.Arrays;
import java.util.Locale;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class MyJavaCompiler {

    private final String fileToCompile;

    public MyJavaCompiler(String fileToCompile) {
        this.fileToCompile = fileToCompile;
    }

    public void compileFile() throws CompilationException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        MyDiagnosticListener listener = new MyDiagnosticListener();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(listener, null, null);

        Iterable fileObjects = fileManager.getJavaFileObjectsFromStrings(Arrays.asList(fileToCompile));
        CompilationTask task = compiler.getTask(null, fileManager, listener, null, null, fileObjects);
        boolean result = task.call(); 
        if (result == true) {
            System.out.println("Compilation has succeeded");
        } else {
            throw new CompilationException(fileToCompile);
        }
    }

    public class CompilationException extends Exception {

        public CompilationException(String filename) {
            super("Failed to compile file " + filename);
        }
    }

    private class MyDiagnosticListener implements DiagnosticListener {

        @Override
        public void report(Diagnostic diagnostic) {
            System.out.println("Code->" + diagnostic.getCode());
            System.out.println("Column Number->" + diagnostic.getColumnNumber());
            System.out.println("End Position->" + diagnostic.getEndPosition());
            System.out.println("Kind->" + diagnostic.getKind());
            System.out.println("Line Number->" + diagnostic.getLineNumber());
            System.out.println("Message->" + diagnostic.getMessage(Locale.ENGLISH));
            System.out.println("Position->" + diagnostic.getPosition());
            System.out.println("Source" + diagnostic.getSource());
            System.out.println("Start Position->" + diagnostic.getStartPosition());
            System.out.println("\n");
        }
    }

}
