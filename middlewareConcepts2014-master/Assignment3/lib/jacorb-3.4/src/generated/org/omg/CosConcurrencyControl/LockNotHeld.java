package org.omg.CosConcurrencyControl;

/**
 * Generated from IDL exception "LockNotHeld".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LockNotHeld
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public LockNotHeld()
	{
		super(org.omg.CosConcurrencyControl.LockNotHeldHelper.id());
	}

	public LockNotHeld(String value)
	{
		super(value);
	}
}
