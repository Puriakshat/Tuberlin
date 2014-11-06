package org.omg.CosNotification;

/**
 * Generated from IDL exception "UnsupportedAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnsupportedAdminHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.UnsupportedAdmin value;

	public UnsupportedAdminHolder ()
	{
	}
	public UnsupportedAdminHolder(final org.omg.CosNotification.UnsupportedAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.UnsupportedAdminHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.UnsupportedAdminHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.UnsupportedAdminHelper.write(_out, value);
	}
}
