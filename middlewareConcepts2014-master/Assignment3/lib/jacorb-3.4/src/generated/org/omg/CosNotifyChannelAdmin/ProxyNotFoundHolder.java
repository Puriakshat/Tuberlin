package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL exception "ProxyNotFound".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ProxyNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyChannelAdmin.ProxyNotFound value;

	public ProxyNotFoundHolder ()
	{
	}
	public ProxyNotFoundHolder(final org.omg.CosNotifyChannelAdmin.ProxyNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyChannelAdmin.ProxyNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyChannelAdmin.ProxyNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyChannelAdmin.ProxyNotFoundHelper.write(_out, value);
	}
}
