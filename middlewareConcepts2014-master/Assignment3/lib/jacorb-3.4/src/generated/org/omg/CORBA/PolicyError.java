package org.omg.CORBA;

/**
 * Generated from IDL exception "PolicyError".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PolicyError
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PolicyError()
	{
		super(org.omg.CORBA.PolicyErrorHelper.id());
	}

	public short reason;
	public PolicyError(java.lang.String _reason,short reason)
	{
		super(_reason);
		this.reason = reason;
	}
	public PolicyError(short reason)
	{
		super(org.omg.CORBA.PolicyErrorHelper.id());
		this.reason = reason;
	}
}
