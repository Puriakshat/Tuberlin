package org.omg.CosTransactions;

/**
 * Generated from IDL interface "Synchronization".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SynchronizationHolder	implements org.omg.CORBA.portable.Streamable{
	 public Synchronization value;
	public SynchronizationHolder()
	{
	}
	public SynchronizationHolder (final Synchronization initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SynchronizationHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SynchronizationHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SynchronizationHelper.write (_out,value);
	}
}
