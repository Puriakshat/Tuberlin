package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "ServerObject".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class ServerObjectPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.jacorb.tao_imr.ImplementationRepository.ServerObjectOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "ping", Integer.valueOf(0));
		m_opsHash.put ( "shutdown", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:ImplementationRepository/ServerObject:1.0"};
	public org.jacorb.tao_imr.ImplementationRepository.ServerObject _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.jacorb.tao_imr.ImplementationRepository.ServerObject __r = org.jacorb.tao_imr.ImplementationRepository.ServerObjectHelper.narrow(__o);
		return __r;
	}
	public org.jacorb.tao_imr.ImplementationRepository.ServerObject _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.jacorb.tao_imr.ImplementationRepository.ServerObject __r = org.jacorb.tao_imr.ImplementationRepository.ServerObjectHelper.narrow(__o);
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
			case 0: // ping
			{
				_out = handler.createReply();
				ping();
				break;
			}
			case 1: // shutdown
			{
				_out = handler.createReply();
				shutdown();
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
