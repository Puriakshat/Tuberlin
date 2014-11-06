package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynAny".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynAnyHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynAny value;
	public DynAnyHolder()
	{
	}
	public DynAnyHolder (final DynAny initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynAnyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynAnyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynAnyHelper.write (_out,value);
	}
}
