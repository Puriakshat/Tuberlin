package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "DuplicateConstraintID".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DuplicateConstraintID
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DuplicateConstraintID()
	{
		super(org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.id());
	}

	public int id;
	public DuplicateConstraintID(java.lang.String _reason,int id)
	{
		super(_reason);
		this.id = id;
	}
	public DuplicateConstraintID(int id)
	{
		super(org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.id());
		this.id = id;
	}
}
