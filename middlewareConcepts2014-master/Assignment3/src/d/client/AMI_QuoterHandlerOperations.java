package d.client;


/**
 * Generated from IDL interface "AMI_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public interface AMI_QuoterHandlerOperations
	extends org.omg.Messaging.ReplyHandlerOperations
{
	/* constants */
	/* operations  */
	void getQuote(Quote ami_return_val);
	void getQuote_excep(org.omg.Messaging.ExceptionHolder excep_holder);
}
