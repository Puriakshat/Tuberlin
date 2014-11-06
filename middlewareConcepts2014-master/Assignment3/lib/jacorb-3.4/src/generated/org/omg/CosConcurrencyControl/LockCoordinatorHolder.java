package org.omg.CosConcurrencyControl;

/**
 * Generated from IDL interface "LockCoordinator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LockCoordinatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public LockCoordinator value;
	public LockCoordinatorHolder()
	{
	}
	public LockCoordinatorHolder (final LockCoordinator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LockCoordinatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LockCoordinatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LockCoordinatorHelper.write (_out,value);
	}
}
