package StockExchangeD;


/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 03-Jun-2014 08:18:59
 */

public abstract class QuoterPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, StockExchangeD.QuoterOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getQuote", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:StockExchangeD/Quoter:1.0"};
	public StockExchangeD.Quoter _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		StockExchangeD.Quoter __r = StockExchangeD.QuoterHelper.narrow(__o);
		return __r;
	}
	public StockExchangeD.Quoter _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		StockExchangeD.Quoter __r = StockExchangeD.QuoterHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // getQuote
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				StockExchangeD.QuoteHelper.write(_out,getQuote(_arg0));
			}
			catch(StockExchangeD.Invalid_Stock _ex0)
			{
				_out = handler.createExceptionReply();
				StockExchangeD.Invalid_StockHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
