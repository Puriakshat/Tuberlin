package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL exception "ConnectionAlreadyInactive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConnectionAlreadyInactiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive value;

	public ConnectionAlreadyInactiveHolder ()
	{
	}
	public ConnectionAlreadyInactiveHolder(final org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyChannelAdmin.ConnectionAlreadyInactiveHelper.write(_out, value);
	}
}
