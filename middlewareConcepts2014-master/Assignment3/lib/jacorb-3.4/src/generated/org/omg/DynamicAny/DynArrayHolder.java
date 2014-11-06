package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynArray".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynArrayHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynArray value;
	public DynArrayHolder()
	{
	}
	public DynArrayHolder (final DynArray initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynArrayHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynArrayHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynArrayHelper.write (_out,value);
	}
}
