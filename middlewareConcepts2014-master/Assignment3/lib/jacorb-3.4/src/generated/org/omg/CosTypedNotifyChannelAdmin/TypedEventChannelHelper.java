package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedEventChannel".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class TypedEventChannelHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TypedEventChannelHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTypedNotifyChannelAdmin/TypedEventChannel:1.0", "TypedEventChannel");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosTypedNotifyChannelAdmin/TypedEventChannel:1.0";
	}
	public static TypedEventChannel read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel)
		{
			return (org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTypedNotifyChannelAdmin/TypedEventChannel:1.0"))
		{
			org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelStub stub;
			stub = new org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel)
		{
			return (org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel)obj;
		}
		else
		{
			org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelStub stub;
			stub = new org.omg.CosTypedNotifyChannelAdmin._TypedEventChannelStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
