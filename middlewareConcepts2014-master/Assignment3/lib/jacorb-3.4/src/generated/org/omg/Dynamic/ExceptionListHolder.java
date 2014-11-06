package org.omg.Dynamic;

/**
 * Generated from IDL alias "ExceptionList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExceptionListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.TypeCode[] value;

	public ExceptionListHolder ()
	{
	}
	public ExceptionListHolder (final org.omg.CORBA.TypeCode[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExceptionListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExceptionListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExceptionListHelper.write (out,value);
	}
}
