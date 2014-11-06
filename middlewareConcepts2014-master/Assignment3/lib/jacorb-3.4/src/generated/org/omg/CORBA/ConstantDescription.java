package org.omg.CORBA;

/**
 * Generated from IDL struct "ConstantDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConstantDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ConstantDescription(){}
	public java.lang.String name = "";
	public java.lang.String id = "";
	public java.lang.String defined_in = "";
	public java.lang.String version = "";
	public org.omg.CORBA.TypeCode type;
	public org.omg.CORBA.Any value;
	public ConstantDescription(java.lang.String name, java.lang.String id, java.lang.String defined_in, java.lang.String version, org.omg.CORBA.TypeCode type, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.id = id;
		this.defined_in = defined_in;
		this.version = version;
		this.type = type;
		this.value = value;
	}
}
