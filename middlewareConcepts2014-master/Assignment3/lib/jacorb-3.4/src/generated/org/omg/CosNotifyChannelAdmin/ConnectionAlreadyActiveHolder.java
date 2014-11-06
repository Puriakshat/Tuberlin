package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL exception "ConnectionAlreadyActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConnectionAlreadyActiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive value;

	public ConnectionAlreadyActiveHolder ()
	{
	}
	public ConnectionAlreadyActiveHolder(final org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.write(_out, value);
	}
}
