package org.omg.CosEventComm;

/**
 * Generated from IDL exception "Disconnected".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DisconnectedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosEventComm.Disconnected value;

	public DisconnectedHolder ()
	{
	}
	public DisconnectedHolder(final org.omg.CosEventComm.Disconnected initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosEventComm.DisconnectedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosEventComm.DisconnectedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosEventComm.DisconnectedHelper.write(_out, value);
	}
}
