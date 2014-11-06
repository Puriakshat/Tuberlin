package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedProxyPushSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TypedProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedProxyPushSupplier value;
	public TypedProxyPushSupplierHolder()
	{
	}
	public TypedProxyPushSupplierHolder (final TypedProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedProxyPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedProxyPushSupplierHelper.write (_out,value);
	}
}
