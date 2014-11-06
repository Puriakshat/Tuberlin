package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedSupplierAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public abstract class TypedSupplierAdminHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TypedSupplierAdminHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTypedNotifyChannelAdmin/TypedSupplierAdmin:1.0", "TypedSupplierAdmin");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin s)
	{
			any.insert_Object(s);
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:omg.org/CosTypedNotifyChannelAdmin/TypedSupplierAdmin:1.0";
	}
	public static TypedSupplierAdmin read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.CosTypedNotifyChannelAdmin._TypedSupplierAdminStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin s)
	{
		_out.write_Object(s);
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin)
		{
			return (org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin)obj;
		}
		else if (obj._is_a("IDL:omg.org/CosTypedNotifyChannelAdmin/TypedSupplierAdmin:1.0"))
		{
			org.omg.CosTypedNotifyChannelAdmin._TypedSupplierAdminStub stub;
			stub = new org.omg.CosTypedNotifyChannelAdmin._TypedSupplierAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin)
		{
			return (org.omg.CosTypedNotifyChannelAdmin.TypedSupplierAdmin)obj;
		}
		else
		{
			org.omg.CosTypedNotifyChannelAdmin._TypedSupplierAdminStub stub;
			stub = new org.omg.CosTypedNotifyChannelAdmin._TypedSupplierAdminStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
