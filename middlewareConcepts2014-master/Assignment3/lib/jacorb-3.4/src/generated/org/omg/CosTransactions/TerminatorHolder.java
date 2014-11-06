package org.omg.CosTransactions;

/**
 * Generated from IDL interface "Terminator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TerminatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Terminator value;
	public TerminatorHolder()
	{
	}
	public TerminatorHolder (final Terminator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TerminatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TerminatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TerminatorHelper.write (_out,value);
	}
}
