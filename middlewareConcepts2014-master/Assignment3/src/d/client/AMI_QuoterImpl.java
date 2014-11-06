package d.client;

import StockExchangeD.AMI_QuoterHandlerPOA;
import StockExchangeD.Quote;
import org.omg.Messaging.ExceptionHolder;


public class AMI_QuoterImpl extends AMI_QuoterHandlerPOA {

    private String quoteInfo;
    private Quote quote;
   
    public AMI_QuoterImpl(String name) {
        quoteInfo = name;
    }

    @Override
    public void getQuote(Quote ami_return_val) {
        quote = ami_return_val;
        System.out.println(quote.price);
        CorbaClientD.reply_count--;
    }

    @Override
    public void getQuote_excep(ExceptionHolder excep_holder) {
        try {
            excep_holder.raise_exception();
        } catch (Exception e) {
            System.out.println("**  async exception: " + e);
        }
    }

}
