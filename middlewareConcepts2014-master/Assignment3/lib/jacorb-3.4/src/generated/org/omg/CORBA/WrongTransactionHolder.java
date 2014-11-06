package org.omg.CORBA;

/**
 * Generated from IDL exception "WrongTransaction".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class WrongTransactionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.WrongTransaction value;

	public WrongTransactionHolder ()
	{
	}
	public WrongTransactionHolder(final org.omg.CORBA.WrongTransaction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.WrongTransactionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.WrongTransactionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.WrongTransactionHelper.write(_out, value);
	}
}
