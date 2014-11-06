package org.omg.CosTrading;

/**
 * Generated from IDL exception "DuplicatePolicyName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DuplicatePolicyName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DuplicatePolicyName()
	{
		super(org.omg.CosTrading.DuplicatePolicyNameHelper.id());
	}

	public java.lang.String name = "";
	public DuplicatePolicyName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public DuplicatePolicyName(java.lang.String name)
	{
		super(org.omg.CosTrading.DuplicatePolicyNameHelper.id());
		this.name = name;
	}
}
