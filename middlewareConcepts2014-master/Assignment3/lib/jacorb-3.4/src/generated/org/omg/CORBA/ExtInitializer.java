package org.omg.CORBA;

/**
 * Generated from IDL struct "ExtInitializer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtInitializer
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ExtInitializer(){}
	public org.omg.CORBA.StructMember[] members;
	public org.omg.CORBA.ExceptionDescription[] exceptions;
	public java.lang.String name = "";
	public ExtInitializer(org.omg.CORBA.StructMember[] members, org.omg.CORBA.ExceptionDescription[] exceptions, java.lang.String name)
	{
		this.members = members;
		this.exceptions = exceptions;
		this.name = name;
	}
}
