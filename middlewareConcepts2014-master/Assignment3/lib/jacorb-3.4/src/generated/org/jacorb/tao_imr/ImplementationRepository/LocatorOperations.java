package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "Locator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface LocatorOperations
	extends org.jacorb.tao_imr.ImplementationRepository.AdministrationOperations
{
	/* constants */
	/* operations  */
	int register_activator(java.lang.String name, org.jacorb.tao_imr.ImplementationRepository.Activator act);
	void unregister_activator(java.lang.String name, int token);
	void notify_child_death(java.lang.String name);
}
