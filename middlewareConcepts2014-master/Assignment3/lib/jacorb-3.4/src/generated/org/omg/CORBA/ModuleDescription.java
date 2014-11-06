package org.omg.CORBA;

/**
 * Generated from IDL struct "ModuleDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ModuleDescription
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ModuleDescription(){}
	public java.lang.String name = "";
	public java.lang.String id = "";
	public java.lang.String defined_in = "";
	public java.lang.String version = "";
	public ModuleDescription(java.lang.String name, java.lang.String id, java.lang.String defined_in, java.lang.String version)
	{
		this.name = name;
		this.id = id;
		this.defined_in = defined_in;
		this.version = version;
	}
}
