package org.omg.dds;

/**
 * Generated from IDL struct "LivelinessLostStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LivelinessLostStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.LivelinessLostStatus value;

	public LivelinessLostStatusHolder ()
	{
	}
	public LivelinessLostStatusHolder(final org.omg.dds.LivelinessLostStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.LivelinessLostStatusHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.LivelinessLostStatusHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.LivelinessLostStatusHelper.write(_out, value);
	}
}
