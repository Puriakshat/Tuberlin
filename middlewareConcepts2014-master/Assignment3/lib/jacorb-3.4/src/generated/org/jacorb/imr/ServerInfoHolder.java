package org.jacorb.imr;

/**
 * Generated from IDL struct "ServerInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.imr.ServerInfo value;

	public ServerInfoHolder ()
	{
	}
	public ServerInfoHolder(final org.jacorb.imr.ServerInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.imr.ServerInfoHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.imr.ServerInfoHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.imr.ServerInfoHelper.write(_out, value);
	}
}
