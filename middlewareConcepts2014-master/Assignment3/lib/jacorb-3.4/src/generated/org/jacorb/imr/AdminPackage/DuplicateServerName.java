package org.jacorb.imr.AdminPackage;

/**
 * Generated from IDL exception "DuplicateServerName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DuplicateServerName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DuplicateServerName()
	{
		super(org.jacorb.imr.AdminPackage.DuplicateServerNameHelper.id());
	}

	public java.lang.String name = "";
	public DuplicateServerName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public DuplicateServerName(java.lang.String name)
	{
		super(org.jacorb.imr.AdminPackage.DuplicateServerNameHelper.id());
		this.name = name;
	}
}
