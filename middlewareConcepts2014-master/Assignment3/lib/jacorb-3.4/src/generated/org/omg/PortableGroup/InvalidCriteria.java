package org.omg.PortableGroup;

/**
 * Generated from IDL exception "InvalidCriteria".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidCriteria
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public InvalidCriteria()
	{
		super(org.omg.PortableGroup.InvalidCriteriaHelper.id());
	}

	public org.omg.PortableGroup.Property[] invalid_criteria;
	public InvalidCriteria(java.lang.String _reason,org.omg.PortableGroup.Property[] invalid_criteria)
	{
		super(_reason);
		this.invalid_criteria = invalid_criteria;
	}
	public InvalidCriteria(org.omg.PortableGroup.Property[] invalid_criteria)
	{
		super(org.omg.PortableGroup.InvalidCriteriaHelper.id());
		this.invalid_criteria = invalid_criteria;
	}
}
