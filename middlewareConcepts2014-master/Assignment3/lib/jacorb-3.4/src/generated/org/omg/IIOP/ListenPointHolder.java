package org.omg.IIOP;

/**
 * Generated from IDL struct "ListenPoint".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ListenPointHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IIOP.ListenPoint value;

	public ListenPointHolder ()
	{
	}
	public ListenPointHolder(final org.omg.IIOP.ListenPoint initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IIOP.ListenPointHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IIOP.ListenPointHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IIOP.ListenPointHelper.write(_out, value);
	}
}
