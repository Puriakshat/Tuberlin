package org.jacorb.imr;

/**
 * Generated from IDL exception "ServerStartupFailed".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerStartupFailedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.imr.ServerStartupFailed value;

	public ServerStartupFailedHolder ()
	{
	}
	public ServerStartupFailedHolder(final org.jacorb.imr.ServerStartupFailed initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.imr.ServerStartupFailedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.imr.ServerStartupFailedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.imr.ServerStartupFailedHelper.write(_out, value);
	}
}
