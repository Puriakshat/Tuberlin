package org.omg.CosTrading.LinkPackage;

/**
 * Generated from IDL exception "DuplicateLinkName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DuplicateLinkName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DuplicateLinkName()
	{
		super(org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.id());
	}

	public java.lang.String name = "";
	public DuplicateLinkName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public DuplicateLinkName(java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.DuplicateLinkNameHelper.id());
		this.name = name;
	}
}
