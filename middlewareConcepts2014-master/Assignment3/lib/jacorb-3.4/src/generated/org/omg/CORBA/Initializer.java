package org.omg.CORBA;

/**
 * Generated from IDL struct "Initializer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Initializer
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Initializer(){}
	public org.omg.CORBA.StructMember[] members;
	public java.lang.String name = "";
	public Initializer(org.omg.CORBA.StructMember[] members, java.lang.String name)
	{
		this.members = members;
		this.name = name;
	}
}
