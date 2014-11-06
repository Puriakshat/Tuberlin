package StockExchange;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AMI_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public class AMI_QuoterHandlerPOATie
	extends AMI_QuoterHandlerPOA
{
	private AMI_QuoterHandlerOperations _delegate;

	private POA _poa;
	public AMI_QuoterHandlerPOATie(AMI_QuoterHandlerOperations delegate)
	{
		_delegate = delegate;
	}
	public AMI_QuoterHandlerPOATie(AMI_QuoterHandlerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public StockExchange.AMI_QuoterHandler _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		StockExchange.AMI_QuoterHandler __r = StockExchange.AMI_QuoterHandlerHelper.narrow(__o);
		return __r;
	}
	public StockExchange.AMI_QuoterHandler _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		StockExchange.AMI_QuoterHandler __r = StockExchange.AMI_QuoterHandlerHelper.narrow(__o);
		return __r;
	}
	public AMI_QuoterHandlerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AMI_QuoterHandlerOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void getQuote_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.getQuote_excep(excep_holder);
	}

	public void getQuote(StockExchange.Quote ami_return_val)
	{
_delegate.getQuote(ami_return_val);
	}

}
