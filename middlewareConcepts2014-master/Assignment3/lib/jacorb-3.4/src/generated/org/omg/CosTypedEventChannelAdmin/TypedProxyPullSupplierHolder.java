package org.omg.CosTypedEventChannelAdmin;

/**
 * Generated from IDL interface "TypedProxyPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TypedProxyPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedProxyPullSupplier value;
	public TypedProxyPullSupplierHolder()
	{
	}
	public TypedProxyPullSupplierHolder (final TypedProxyPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedProxyPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedProxyPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedProxyPullSupplierHelper.write (_out,value);
	}
}
