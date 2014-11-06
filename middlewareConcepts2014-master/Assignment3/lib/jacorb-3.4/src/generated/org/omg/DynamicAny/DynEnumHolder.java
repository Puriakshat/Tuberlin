package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynEnum".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynEnumHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynEnum value;
	public DynEnumHolder()
	{
	}
	public DynEnumHolder (final DynEnum initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynEnumHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynEnumHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynEnumHelper.write (_out,value);
	}
}
