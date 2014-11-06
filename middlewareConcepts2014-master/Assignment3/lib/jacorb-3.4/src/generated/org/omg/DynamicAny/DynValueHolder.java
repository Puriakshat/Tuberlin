package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynValueHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynValue value;
	public DynValueHolder()
	{
	}
	public DynValueHolder (final DynValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynValueHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynValueHelper.write (_out,value);
	}
}
