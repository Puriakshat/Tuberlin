package org.omg.CosTransactions;

/**
 * Generated from IDL exception "HeuristicRollback".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HeuristicRollbackHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.HeuristicRollback value;

	public HeuristicRollbackHolder ()
	{
	}
	public HeuristicRollbackHolder(final org.omg.CosTransactions.HeuristicRollback initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.HeuristicRollbackHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.HeuristicRollbackHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.HeuristicRollbackHelper.write(_out, value);
	}
}
