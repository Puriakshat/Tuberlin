package org.omg.Security;

/**
 * Generated from IDL struct "Right".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Right
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Right(){}
	public org.omg.Security.ExtensibleFamily rights_family;
	public java.lang.String right = "";
	public Right(org.omg.Security.ExtensibleFamily rights_family, java.lang.String right)
	{
		this.rights_family = rights_family;
		this.right = right;
	}
}
