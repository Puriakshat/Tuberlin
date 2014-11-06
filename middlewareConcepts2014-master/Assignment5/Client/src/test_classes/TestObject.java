package test_classes;

import java.io.Serializable;

public class TestObject implements Serializable {

    private int param1;
    private int param2;

    public TestObject() {
        this.param1 = 0;
        this.param2 = 0;
    }
    
   public void increaseParams(){
       this.param1 += 10;
       this.param2 += 10;              
   }
    
    @Override
    public String toString(){
        return ("param1: " + param1 + "\nparam2: " + param2);
    }
    
}
