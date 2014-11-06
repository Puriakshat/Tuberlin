package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "UnknownTraderName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownTraderName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnknownTraderName()
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id());
	}

	public java.lang.String[] name;
	public UnknownTraderName(java.lang.String _reason,java.lang.String[] name)
	{
		super(_reason);
		this.name = name;
	}
	public UnknownTraderName(java.lang.String[] name)
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownTraderNameHelper.id());
		this.name = name;
	}
}
