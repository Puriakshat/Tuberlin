package org.omg.CosTransactions;

/**
 * Generated from IDL exception "NotPrepared".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NotPreparedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.NotPrepared value;

	public NotPreparedHolder ()
	{
	}
	public NotPreparedHolder(final org.omg.CosTransactions.NotPrepared initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.NotPreparedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.NotPreparedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.NotPreparedHelper.write(_out, value);
	}
}
