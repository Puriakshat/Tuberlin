package org.omg.CosCollection;


/**
 * Generated from IDL interface "PriorityQueue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class PriorityQueuePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosCollection.PriorityQueueOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "purge", Integer.valueOf(0));
		m_opsHash.put ( "unfilled", Integer.valueOf(1));
		m_opsHash.put ( "size", Integer.valueOf(2));
		m_opsHash.put ( "element_dequeue", Integer.valueOf(3));
		m_opsHash.put ( "dequeue", Integer.valueOf(4));
		m_opsHash.put ( "enqueue", Integer.valueOf(5));
	}
	private String[] ids = {"IDL:omg.org/CosCollection/PriorityQueue:1.0","IDL:omg.org/CosCollection/RestrictedAccessCollection:1.0"};
	public org.omg.CosCollection.PriorityQueue _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		org.omg.CosCollection.PriorityQueue __r = org.omg.CosCollection.PriorityQueueHelper.narrow(__o);
		return __r;
	}
	public org.omg.CosCollection.PriorityQueue _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		org.omg.CosCollection.PriorityQueue __r = org.omg.CosCollection.PriorityQueueHelper.narrow(__o);
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
			case 0: // purge
			{
				_out = handler.createReply();
				purge();
				break;
			}
			case 1: // unfilled
			{
				_out = handler.createReply();
				_out.write_boolean(unfilled());
				break;
			}
			case 2: // size
			{
				_out = handler.createReply();
				_out.write_ulong(size());
				break;
			}
			case 3: // element_dequeue
			{
			try
			{
				org.omg.CORBA.AnyHolder _arg0= new org.omg.CORBA.AnyHolder();
				_out = handler.createReply();
				_out.write_boolean(element_dequeue(_arg0));
				_out.write_any(_arg0.value);
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // dequeue
			{
			try
			{
				_out = handler.createReply();
				dequeue();
			}
			catch(org.omg.CosCollection.EmptyCollection _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.EmptyCollectionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // enqueue
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				enqueue(_arg0);
			}
			catch(org.omg.CosCollection.ElementInvalid _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosCollection.ElementInvalidHelper.write(_out, _ex0);
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
