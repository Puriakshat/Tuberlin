package org.jacorb.transport;

/**
 * Generated from IDL exception "NoContext".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
 */

public final class NoContextHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.transport.NoContext value;

	public NoContextHolder ()
	{
	}
	public NoContextHolder(final org.jacorb.transport.NoContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.transport.NoContextHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.transport.NoContextHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.transport.NoContextHelper.write(_out, value);
	}
}
