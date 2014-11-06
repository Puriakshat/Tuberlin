package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "UnknownPropertyName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownPropertyName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnknownPropertyName()
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.id());
	}

	public java.lang.String name = "";
	public UnknownPropertyName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public UnknownPropertyName(java.lang.String name)
	{
		super(org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.id());
		this.name = name;
	}
}
