package org.omg.CosTransactions;

/**
 * Generated from IDL exception "HeuristicMixed".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HeuristicMixedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.HeuristicMixed value;

	public HeuristicMixedHolder ()
	{
	}
	public HeuristicMixedHolder(final org.omg.CosTransactions.HeuristicMixed initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.HeuristicMixedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.HeuristicMixedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.HeuristicMixedHelper.write(_out, value);
	}
}
