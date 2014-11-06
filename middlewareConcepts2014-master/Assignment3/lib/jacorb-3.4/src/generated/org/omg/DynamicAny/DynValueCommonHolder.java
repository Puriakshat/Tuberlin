package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynValueCommon".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynValueCommonHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynValueCommon value;
	public DynValueCommonHolder()
	{
	}
	public DynValueCommonHolder (final DynValueCommon initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynValueCommonHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynValueCommonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynValueCommonHelper.write (_out,value);
	}
}
