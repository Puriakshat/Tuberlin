package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "StructuredProxyPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StructuredProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public StructuredProxyPullSupplier value;
	public StructuredProxyPullSupplierHolder()
	{
	}
	public StructuredProxyPullSupplierHolder (final StructuredProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StructuredProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StructuredProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StructuredProxyPullSupplierHelper.write (_out,value);
	}
}
