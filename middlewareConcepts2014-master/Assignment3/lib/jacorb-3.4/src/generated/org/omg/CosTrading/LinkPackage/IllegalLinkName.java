package org.omg.CosTrading.LinkPackage;

/**
 * Generated from IDL exception "IllegalLinkName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IllegalLinkName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IllegalLinkName()
	{
		super(org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.id());
	}

	public java.lang.String name = "";
	public IllegalLinkName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public IllegalLinkName(java.lang.String name)
	{
		super(org.omg.CosTrading.LinkPackage.IllegalLinkNameHelper.id());
		this.name = name;
	}
}
