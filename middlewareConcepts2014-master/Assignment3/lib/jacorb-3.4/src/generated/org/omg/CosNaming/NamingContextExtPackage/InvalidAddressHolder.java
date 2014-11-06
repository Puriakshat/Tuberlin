package org.omg.CosNaming.NamingContextExtPackage;

/**
 * Generated from IDL exception "InvalidAddress".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidAddressHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NamingContextExtPackage.InvalidAddress value;

	public InvalidAddressHolder ()
	{
	}
	public InvalidAddressHolder(final org.omg.CosNaming.NamingContextExtPackage.InvalidAddress initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.write(_out, value);
	}
}
