package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "StructuredProxyPushSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StructuredProxyPushSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPushSupplier value;
	public StructuredProxyPushSupplierHolder()
	{
	}
	public StructuredProxyPushSupplierHolder (final StructuredProxyPushSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPushSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPushSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPushSupplierHelper.write (_out,value);
	}
}
