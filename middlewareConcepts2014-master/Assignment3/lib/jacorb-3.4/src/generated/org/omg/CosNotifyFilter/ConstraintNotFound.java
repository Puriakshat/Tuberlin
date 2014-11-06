package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "ConstraintNotFound".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConstraintNotFound
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ConstraintNotFound()
	{
		super(org.omg.CosNotifyFilter.ConstraintNotFoundHelper.id());
	}

	public int id;
	public ConstraintNotFound(java.lang.String _reason,int id)
	{
		super(_reason);
		this.id = id;
	}
	public ConstraintNotFound(int id)
	{
		super(org.omg.CosNotifyFilter.ConstraintNotFoundHelper.id());
		this.id = id;
	}
}
