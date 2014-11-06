package org.omg.PortableInterceptor;

/**
 * Generated from IDL exception "InvalidSlot".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidSlotHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableInterceptor.InvalidSlot value;

	public InvalidSlotHolder ()
	{
	}
	public InvalidSlotHolder(final org.omg.PortableInterceptor.InvalidSlot initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableInterceptor.InvalidSlotHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableInterceptor.InvalidSlotHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableInterceptor.InvalidSlotHelper.write(_out, value);
	}
}
