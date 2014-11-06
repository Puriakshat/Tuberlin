package org.omg.CosTrading.LinkPackage;

/**
 * Generated from IDL exception "UnknownLinkName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownLinkName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnknownLinkName()
	{
		super(org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.id());
	}

	public java.lang.String name = "";
	public UnknownLinkName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public UnknownLinkName(java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.UnknownLinkNameHelper.id());
		this.name = name;
	}
}
