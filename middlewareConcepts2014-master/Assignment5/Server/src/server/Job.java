package server;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Job {

    private final Class job;
    private String[] methodName;
    private final Object obj;
    private Object[] parameters;

    public Job(Class<?> job, String methodName, Object obj, Object[] parameters) {
        this.job = job;
        this.methodName = (methodName==null)? null : new String[]{methodName};
        this.obj = obj;
        
        if(parameters!=null)
            this.parameters = Arrays.copyOf(parameters, parameters.length);
    }

    //http://tutorials.jenkov.com/java-reflection/methods.html
    public Object executeMethod() {
        methodName = (methodName == null) ? getMethodsNames() : this.methodName;
        Object returnValue = null;
        try {
            returnValue = invokeMethods();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
            System.err.println(ex);
        }
        return returnValue;
    }

    private String[] getMethodsNames() {
        String thisMethodName ;
        List<String> listOfMethods = new ArrayList<>(10);
        for (Method method : job.getMethods()) {
            for (Annotation annotation : method.getAnnotations()) {
                if (annotation.toString().contains("InvokeThis")) {
                    thisMethodName = method.toString();
                    listOfMethods.add(parseMethodName(thisMethodName));
                }
            }
        }
        return (listOfMethods.toArray(new String[listOfMethods.size()]));
    }
    
    private Object[]invokeMethods() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException{
        List<Object> results = new ArrayList<>();
        for (String methodName1 : methodName) {
            Method method = getMethod(methodName1);
            results.add(method.invoke(obj, parameters));
        }
        return results.toArray();
    }
    
    private Method getMethod(String methodName) throws NoSuchMethodException{
        for(Method m: job.getMethods()){
            if((m.toString()).contains(methodName))                
                if(this.parameters==null)
                    return m;
                else if(m.getParameterTypes().length==parameters.length)
                    return m;
        }
        throw new NoSuchMethodException();
    }

    private String parseMethodName(String thisMethodName) {
        String[] components = thisMethodName.split("\\.");
        return (components[components.length - 1]).replace("()", "");
    }
}
