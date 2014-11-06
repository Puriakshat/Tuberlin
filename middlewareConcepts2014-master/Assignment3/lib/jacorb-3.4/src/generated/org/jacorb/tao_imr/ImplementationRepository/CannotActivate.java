package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL exception "CannotActivate".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CannotActivate
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CannotActivate()
	{
		super(org.jacorb.tao_imr.ImplementationRepository.CannotActivateHelper.id());
	}

	public java.lang.String reason = "";
	public CannotActivate(java.lang.String _reason,java.lang.String reason)
	{
		super(_reason);
		this.reason = reason;
	}
	public CannotActivate(java.lang.String reason)
	{
		super(org.jacorb.tao_imr.ImplementationRepository.CannotActivateHelper.id());
		this.reason = reason;
	}
}
