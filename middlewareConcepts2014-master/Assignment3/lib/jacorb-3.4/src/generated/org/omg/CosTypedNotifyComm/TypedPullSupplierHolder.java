package org.omg.CosTypedNotifyComm;

/**
 * Generated from IDL interface "TypedPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TypedPullSupplierHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedPullSupplier value;
	public TypedPullSupplierHolder()
	{
	}
	public TypedPullSupplierHolder (final TypedPullSupplier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedPullSupplierHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedPullSupplierHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedPullSupplierHelper.write (_out,value);
	}
}
