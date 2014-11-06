package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL struct "StartupOptions".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StartupOptions
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public StartupOptions(){}
	public java.lang.String command_line = "";
	public org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] environment;
	public java.lang.String working_directory = "";
	public org.jacorb.tao_imr.ImplementationRepository.ActivationMode activation;
	public java.lang.String activator = "";
	public int start_limit;
	public StartupOptions(java.lang.String command_line, org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] environment, java.lang.String working_directory, org.jacorb.tao_imr.ImplementationRepository.ActivationMode activation, java.lang.String activator, int start_limit)
	{
		this.command_line = command_line;
		this.environment = environment;
		this.working_directory = working_directory;
		this.activation = activation;
		this.activator = activator;
		this.start_limit = start_limit;
	}
}
