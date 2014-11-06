package org.omg.CosNotification;

/**
 * Generated from IDL struct "PropertyError".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PropertyErrorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.PropertyError value;

	public PropertyErrorHolder ()
	{
	}
	public PropertyErrorHolder(final org.omg.CosNotification.PropertyError initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotification.PropertyErrorHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotification.PropertyErrorHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotification.PropertyErrorHelper.write(_out, value);
	}
}
