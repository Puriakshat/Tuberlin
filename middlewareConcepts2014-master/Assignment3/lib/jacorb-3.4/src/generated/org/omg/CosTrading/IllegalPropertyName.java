package org.omg.CosTrading;

/**
 * Generated from IDL exception "IllegalPropertyName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IllegalPropertyName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IllegalPropertyName()
	{
		super(org.omg.CosTrading.IllegalPropertyNameHelper.id());
	}

	public java.lang.String name = "";
	public IllegalPropertyName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public IllegalPropertyName(java.lang.String name)
	{
		super(org.omg.CosTrading.IllegalPropertyNameHelper.id());
		this.name = name;
	}
}
