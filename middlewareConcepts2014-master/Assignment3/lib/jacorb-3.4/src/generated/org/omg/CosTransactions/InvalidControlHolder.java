package org.omg.CosTransactions;

/**
 * Generated from IDL exception "InvalidControl".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidControlHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.InvalidControl value;

	public InvalidControlHolder ()
	{
	}
	public InvalidControlHolder(final org.omg.CosTransactions.InvalidControl initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.InvalidControlHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.InvalidControlHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.InvalidControlHelper.write(_out, value);
	}
}
