package org.omg.CORBA;

/**
 * Generated from IDL exception "InvalidPolicies".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidPolicies
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public InvalidPolicies()
	{
		super(org.omg.CORBA.InvalidPoliciesHelper.id());
	}

	public short[] indicies;
	public InvalidPolicies(java.lang.String _reason,short[] indicies)
	{
		super(_reason);
		this.indicies = indicies;
	}
	public InvalidPolicies(short[] indicies)
	{
		super(org.omg.CORBA.InvalidPoliciesHelper.id());
		this.indicies = indicies;
	}
}
