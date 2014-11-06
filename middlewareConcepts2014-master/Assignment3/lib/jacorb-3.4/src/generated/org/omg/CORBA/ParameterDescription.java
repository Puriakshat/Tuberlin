package org.omg.CORBA;

/**
 * Generated from IDL struct "ParameterDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ParameterDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ParameterDescription(){}
	public java.lang.String name = "";
	public org.omg.CORBA.TypeCode type;
	public org.omg.CORBA.IDLType type_def;
	public org.omg.CORBA.ParameterMode mode;
	public ParameterDescription(java.lang.String name, org.omg.CORBA.TypeCode type, org.omg.CORBA.IDLType type_def, org.omg.CORBA.ParameterMode mode)
	{
		this.name = name;
		this.type = type;
		this.type_def = type_def;
		this.mode = mode;
	}
}
