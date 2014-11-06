package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedSupplierAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TypedSupplierAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedSupplierAdmin value;
	public TypedSupplierAdminHolder()
	{
	}
	public TypedSupplierAdminHolder (final TypedSupplierAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedSupplierAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedSupplierAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedSupplierAdminHelper.write (_out,value);
	}
}
