package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "Activator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ActivatorOperations
{
	/* constants */
	/* operations  */
	void start_server(java.lang.String name, java.lang.String cmdline, java.lang.String dir, org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] env) throws org.jacorb.tao_imr.ImplementationRepository.CannotActivate;
	void shutdown();
}
