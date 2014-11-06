package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL struct "StartupInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StartupInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public StartupInfo(){}
	public java.lang.String name = "";
	public java.lang.String partial_ior = "";
	public java.lang.String ior = "";
	public StartupInfo(java.lang.String name, java.lang.String partial_ior, java.lang.String ior)
	{
		this.name = name;
		this.partial_ior = partial_ior;
		this.ior = ior;
	}
}
