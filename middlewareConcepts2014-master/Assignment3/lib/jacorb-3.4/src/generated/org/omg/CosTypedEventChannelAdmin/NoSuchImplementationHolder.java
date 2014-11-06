package org.omg.CosTypedEventChannelAdmin;

/**
 * Generated from IDL exception "NoSuchImplementation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NoSuchImplementationHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTypedEventChannelAdmin.NoSuchImplementation value;

	public NoSuchImplementationHolder ()
	{
	}
	public NoSuchImplementationHolder(final org.omg.CosTypedEventChannelAdmin.NoSuchImplementation initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTypedEventChannelAdmin.NoSuchImplementationHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTypedEventChannelAdmin.NoSuchImplementationHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTypedEventChannelAdmin.NoSuchImplementationHelper.write(_out, value);
	}
}
