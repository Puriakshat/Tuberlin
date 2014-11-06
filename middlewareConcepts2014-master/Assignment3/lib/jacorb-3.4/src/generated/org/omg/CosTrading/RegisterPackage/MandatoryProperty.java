package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "MandatoryProperty".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MandatoryProperty
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MandatoryProperty()
	{
		super(org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.id());
	}

	public java.lang.String type = "";
	public java.lang.String name = "";
	public MandatoryProperty(java.lang.String _reason,java.lang.String type, java.lang.String name)
	{
		super(_reason);
		this.type = type;
		this.name = name;
	}
	public MandatoryProperty(java.lang.String type, java.lang.String name)
	{
		super(org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.id());
		this.type = type;
		this.name = name;
	}
}
