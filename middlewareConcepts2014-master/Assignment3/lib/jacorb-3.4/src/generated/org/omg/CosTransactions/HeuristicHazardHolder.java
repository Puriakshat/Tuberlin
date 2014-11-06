package org.omg.CosTransactions;

/**
 * Generated from IDL exception "HeuristicHazard".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HeuristicHazardHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTransactions.HeuristicHazard value;

	public HeuristicHazardHolder ()
	{
	}
	public HeuristicHazardHolder(final org.omg.CosTransactions.HeuristicHazard initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTransactions.HeuristicHazardHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTransactions.HeuristicHazardHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTransactions.HeuristicHazardHelper.write(_out, value);
	}
}
