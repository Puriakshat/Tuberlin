package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynStruct".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynStructHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynStruct value;
	public DynStructHolder()
	{
	}
	public DynStructHolder (final DynStruct initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynStructHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynStructHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynStructHelper.write (_out,value);
	}
}
