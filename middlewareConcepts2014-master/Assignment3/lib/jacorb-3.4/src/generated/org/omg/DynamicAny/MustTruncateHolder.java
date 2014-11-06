package org.omg.DynamicAny;

/**
 * Generated from IDL exception "MustTruncate".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MustTruncateHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.MustTruncate value;

	public MustTruncateHolder ()
	{
	}
	public MustTruncateHolder(final org.omg.DynamicAny.MustTruncate initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DynamicAny.MustTruncateHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DynamicAny.MustTruncateHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DynamicAny.MustTruncateHelper.write(_out, value);
	}
}
