package org.omg.CORBA;

/**
 * Generated from IDL exception "BadFixedValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BadFixedValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.BadFixedValue value;

	public BadFixedValueHolder ()
	{
	}
	public BadFixedValueHolder(final org.omg.CORBA.BadFixedValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.BadFixedValueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.BadFixedValueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.BadFixedValueHelper.write(_out, value);
	}
}
