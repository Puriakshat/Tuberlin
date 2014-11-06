package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL struct "ServerInformation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerInformation
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServerInformation(){}
	public java.lang.String server = "";
	public org.jacorb.tao_imr.ImplementationRepository.StartupOptions startup;
	public java.lang.String partial_ior = "";
	public ServerInformation(java.lang.String server, org.jacorb.tao_imr.ImplementationRepository.StartupOptions startup, java.lang.String partial_ior)
	{
		this.server = server;
		this.startup = startup;
		this.partial_ior = partial_ior;
	}
}
