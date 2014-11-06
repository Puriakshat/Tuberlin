package org.omg.CosTrading;

/**
 * Generated from IDL exception "DuplicatePropertyName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DuplicatePropertyName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DuplicatePropertyName()
	{
		super(org.omg.CosTrading.DuplicatePropertyNameHelper.id());
	}

	public java.lang.String name = "";
	public DuplicatePropertyName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public DuplicatePropertyName(java.lang.String name)
	{
		super(org.omg.CosTrading.DuplicatePropertyNameHelper.id());
		this.name = name;
	}
}
