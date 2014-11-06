package org.omg.CosTransactions;

/**
 * Generated from IDL exception "SynchronizationUnavailable".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SynchronizationUnavailableHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.SynchronizationUnavailable value;

	public SynchronizationUnavailableHolder ()
	{
	}
	public SynchronizationUnavailableHolder(final org.omg.CosTransactions.SynchronizationUnavailable initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.SynchronizationUnavailableHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.SynchronizationUnavailableHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.SynchronizationUnavailableHelper.write(_out, value);
	}
}
