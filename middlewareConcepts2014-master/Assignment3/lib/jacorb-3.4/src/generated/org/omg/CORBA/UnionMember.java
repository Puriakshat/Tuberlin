package org.omg.CORBA;

/**
 * Generated from IDL struct "UnionMember".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnionMember
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnionMember(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any label;
	public org.omg.CORBA.TypeCode type;
	public org.omg.CORBA.IDLType type_def;
	public UnionMember(java.lang.String name, org.omg.CORBA.Any label, org.omg.CORBA.TypeCode type, org.omg.CORBA.IDLType type_def)
	{
		this.name = name;
		this.label = label;
		this.type = type;
		this.type_def = type_def;
	}
}
