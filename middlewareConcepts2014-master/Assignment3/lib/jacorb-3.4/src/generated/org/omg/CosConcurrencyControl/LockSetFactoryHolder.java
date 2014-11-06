package org.omg.CosConcurrencyControl;

/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LockSetFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public LockSetFactory value;
	public LockSetFactoryHolder()
	{
	}
	public LockSetFactoryHolder (final LockSetFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LockSetFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LockSetFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LockSetFactoryHelper.write (_out,value);
	}
}
