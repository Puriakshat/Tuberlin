package org.omg.CosTransactions;

/**
 * Generated from IDL exception "NoTransaction".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NoTransactionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.NoTransaction value;

	public NoTransactionHolder ()
	{
	}
	public NoTransactionHolder(final org.omg.CosTransactions.NoTransaction initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.NoTransactionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.NoTransactionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.NoTransactionHelper.write(_out, value);
	}
}
