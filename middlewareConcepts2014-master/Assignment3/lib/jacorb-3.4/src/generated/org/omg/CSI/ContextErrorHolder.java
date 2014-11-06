package org.omg.CSI;

/**
 * Generated from IDL struct "ContextError".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ContextErrorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSI.ContextError value;

	public ContextErrorHolder ()
	{
	}
	public ContextErrorHolder(final org.omg.CSI.ContextError initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CSI.ContextErrorHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CSI.ContextErrorHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CSI.ContextErrorHelper.write(_out, value);
	}
}
