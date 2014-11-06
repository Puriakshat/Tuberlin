package org.jacorb.imr.AdminPackage;

/**
 * Generated from IDL exception "UnknownHostName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownHostNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.imr.AdminPackage.UnknownHostName value;

	public UnknownHostNameHolder ()
	{
	}
	public UnknownHostNameHolder(final org.jacorb.imr.AdminPackage.UnknownHostName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.imr.AdminPackage.UnknownHostNameHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.imr.AdminPackage.UnknownHostNameHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.imr.AdminPackage.UnknownHostNameHelper.write(_out, value);
	}
}
