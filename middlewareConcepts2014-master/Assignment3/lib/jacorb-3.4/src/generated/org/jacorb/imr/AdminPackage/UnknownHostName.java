package org.jacorb.imr.AdminPackage;

/**
 * Generated from IDL exception "UnknownHostName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownHostName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnknownHostName()
	{
		super(org.jacorb.imr.AdminPackage.UnknownHostNameHelper.id());
	}

	public java.lang.String name = "";
	public UnknownHostName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public UnknownHostName(java.lang.String name)
	{
		super(org.jacorb.imr.AdminPackage.UnknownHostNameHelper.id());
		this.name = name;
	}
}
