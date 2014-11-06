package org.omg.CosTrading;

/**
 * Generated from IDL struct "Policy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Policy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Policy(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any value;
	public Policy(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}
