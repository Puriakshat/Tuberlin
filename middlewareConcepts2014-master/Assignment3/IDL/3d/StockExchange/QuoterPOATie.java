package StockExchange;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public class QuoterPOATie
	extends QuoterPOA
{
	private QuoterOperations _delegate;

	private POA _poa;
	public QuoterPOATie(QuoterOperations delegate)
	{
		_delegate = delegate;
	}
	public QuoterPOATie(QuoterOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public StockExchange.Quoter _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		StockExchange.Quoter __r = StockExchange.QuoterHelper.narrow(__o);
		return __r;
	}
	public StockExchange.Quoter _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		StockExchange.Quoter __r = StockExchange.QuoterHelper.narrow(__o);
		return __r;
	}
	public QuoterOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QuoterOperations delegate)
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
	public StockExchange.Quote getQuote(java.lang.String quoteInfo) throws StockExchange.Invalid_Stock
	{
		return _delegate.getQuote(quoteInfo);
	}

}
