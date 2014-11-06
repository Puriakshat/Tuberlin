package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL struct "EnvironmentVariable".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EnvironmentVariable
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EnvironmentVariable(){}
	public java.lang.String name = "";
	public java.lang.String value = "";
	public EnvironmentVariable(java.lang.String name, java.lang.String value)
	{
		this.name = name;
		this.value = value;
	}
}
