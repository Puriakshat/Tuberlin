package org.omg.CosTypedNotifyComm;


/**
 * Generated from IDL interface "TypedPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class TypedPushConsumerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TypedPushConsumerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTypedNotifyComm/TypedPushConsumer:1.0", "TypedPushConsumer");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTypedNotifyComm.TypedPushConsumer s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTypedNotifyComm.TypedPushConsumer extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosTypedNotifyComm/TypedPushConsumer:1.0";
	}
	public static TypedPushConsumer read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTypedNotifyComm._TypedPushConsumerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTypedNotifyComm.TypedPushConsumer s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTypedNotifyComm.TypedPushConsumer narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyComm.TypedPushConsumer)
		{
			return (org.omg.CosTypedNotifyComm.TypedPushConsumer)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTypedNotifyComm/TypedPushConsumer:1.0"))
		{
			org.omg.CosTypedNotifyComm._TypedPushConsumerStub stub;
			stub = new org.omg.CosTypedNotifyComm._TypedPushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTypedNotifyComm.TypedPushConsumer unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyComm.TypedPushConsumer)
		{
			return (org.omg.CosTypedNotifyComm.TypedPushConsumer)obj;
		}
		else
		{
			org.omg.CosTypedNotifyComm._TypedPushConsumerStub stub;
			stub = new org.omg.CosTypedNotifyComm._TypedPushConsumerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
