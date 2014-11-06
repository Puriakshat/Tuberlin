package org.omg.CosTransactions;

/**
 * Generated from IDL exception "HeuristicCommit".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HeuristicCommitHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.HeuristicCommit value;

	public HeuristicCommitHolder ()
	{
	}
	public HeuristicCommitHolder(final org.omg.CosTransactions.HeuristicCommit initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.HeuristicCommitHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.HeuristicCommitHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.HeuristicCommitHelper.write(_out, value);
	}
}
