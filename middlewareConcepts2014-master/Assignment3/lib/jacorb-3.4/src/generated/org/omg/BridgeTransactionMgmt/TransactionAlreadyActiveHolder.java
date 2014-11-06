package org.omg.BridgeTransactionMgmt;

/**
 * Generated from IDL exception "TransactionAlreadyActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TransactionAlreadyActiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.BridgeTransactionMgmt.TransactionAlreadyActive value;

	public TransactionAlreadyActiveHolder ()
	{
	}
	public TransactionAlreadyActiveHolder(final org.omg.BridgeTransactionMgmt.TransactionAlreadyActive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.BridgeTransactionMgmt.TransactionAlreadyActiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.BridgeTransactionMgmt.TransactionAlreadyActiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.BridgeTransactionMgmt.TransactionAlreadyActiveHelper.write(_out, value);
	}
}
