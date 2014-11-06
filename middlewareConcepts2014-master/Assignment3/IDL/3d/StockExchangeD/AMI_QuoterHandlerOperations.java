package StockExchangeD;


/**
 * Generated from IDL interface "AMI_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 03-Jun-2014 08:18:59
 */

public interface AMI_QuoterHandlerOperations
	extends org.omg.Messaging.ReplyHandlerOperations
{
	/* constants */
	/* operations  */
	void getQuote(StockExchangeD.Quote ami_return_val);
	void getQuote_excep(org.omg.Messaging.ExceptionHolder excep_holder);
}
