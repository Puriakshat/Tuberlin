package org.omg.CORBA;

/**
 * Generated from IDL exception "UnknownUserException".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownUserException
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnknownUserException()
	{
		super(org.omg.CORBA.UnknownUserExceptionHelper.id());
	}

	public org.omg.CORBA.Any except;
	public UnknownUserException(java.lang.String _reason,org.omg.CORBA.Any except)
	{
		super(_reason);
		this.except = except;
	}
	public UnknownUserException(org.omg.CORBA.Any except)
	{
		super(org.omg.CORBA.UnknownUserExceptionHelper.id());
		this.except = except;
	}
}
