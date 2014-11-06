
package c.client;



public class ResponderImpl extends ResponderPOA{
    
    
    @Override
    public void push(Quote quote) {
        System.out.println(quote.price);
    }
    
}
