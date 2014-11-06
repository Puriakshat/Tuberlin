package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL exception "AlreadyRegistered".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AlreadyRegistered
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AlreadyRegistered()
	{
		super(org.jacorb.tao_imr.ImplementationRepository.AlreadyRegisteredHelper.id());
	}

	public AlreadyRegistered(String value)
	{
		super(value);
	}
}
