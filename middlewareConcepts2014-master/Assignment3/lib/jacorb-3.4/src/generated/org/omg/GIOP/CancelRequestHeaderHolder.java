package org.omg.GIOP;

/**
 * Generated from IDL struct "CancelRequestHeader".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CancelRequestHeaderHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GIOP.CancelRequestHeader value;

	public CancelRequestHeaderHolder ()
	{
	}
	public CancelRequestHeaderHolder(final org.omg.GIOP.CancelRequestHeader initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GIOP.CancelRequestHeaderHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GIOP.CancelRequestHeaderHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GIOP.CancelRequestHeaderHelper.write(_out, value);
	}
}
