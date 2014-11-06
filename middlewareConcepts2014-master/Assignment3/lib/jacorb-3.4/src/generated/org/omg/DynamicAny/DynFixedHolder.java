package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynFixed".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynFixedHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynFixed value;
	public DynFixedHolder()
	{
	}
	public DynFixedHolder (final DynFixed initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynFixedHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynFixedHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynFixedHelper.write (_out,value);
	}
}
