package d.client;


/**
 * Generated from IDL interface "AMI_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public abstract class AMI_QuoterHandlerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, AMI_QuoterHandlerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getQuote_excep", Integer.valueOf(0));
		m_opsHash.put ( "getQuote", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:StockExchange/AMI_QuoterHandler:1.0","IDL:omg.org/Messaging/ReplyHandler:1.0"};
	public AMI_QuoterHandler _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		AMI_QuoterHandler __r = AMI_QuoterHandlerHelper.narrow(__o);
		return __r;
	}
	public AMI_QuoterHandler _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		AMI_QuoterHandler __r = AMI_QuoterHandlerHelper.narrow(__o);
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
			case 0: // getQuote_excep
			{
				org.omg.Messaging.ExceptionHolder _arg0=(org.omg.Messaging.ExceptionHolder)((org.omg.CORBA_2_3.portable.InputStream)_input).read_value ("IDL:omg.org/Messaging/ExceptionHolder:1.0");
				_out = handler.createReply();
				getQuote_excep(_arg0);
				break;
			}
			case 1: // getQuote
			{
				Quote _arg0=QuoteHelper.read(_input);
				_out = handler.createReply();
				getQuote(_arg0);
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
