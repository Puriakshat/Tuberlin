package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "SupplierAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SupplierAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public SupplierAdmin value;
	public SupplierAdminHolder()
	{
	}
	public SupplierAdminHolder (final SupplierAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SupplierAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SupplierAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SupplierAdminHelper.write (_out,value);
	}
}
