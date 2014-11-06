package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "Administration".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface AdministrationOperations
{
	/* constants */
	/* operations  */
	void activate_server(java.lang.String server) throws org.jacorb.tao_imr.ImplementationRepository.NotFound,org.jacorb.tao_imr.ImplementationRepository.CannotActivate;
	void add_or_update_server(java.lang.String server, org.jacorb.tao_imr.ImplementationRepository.StartupOptions options) throws org.jacorb.tao_imr.ImplementationRepository.NotFound;
	void remove_server(java.lang.String server) throws org.jacorb.tao_imr.ImplementationRepository.NotFound;
	void shutdown_server(java.lang.String server) throws org.jacorb.tao_imr.ImplementationRepository.NotFound;
	void server_is_running(java.lang.String server, java.lang.String partial_ior, org.jacorb.tao_imr.ImplementationRepository.ServerObject server_object) throws org.jacorb.tao_imr.ImplementationRepository.NotFound;
	void server_is_shutting_down(java.lang.String server) throws org.jacorb.tao_imr.ImplementationRepository.NotFound;
	void find(java.lang.String server, org.jacorb.tao_imr.ImplementationRepository.ServerInformationHolder info);
	void list(int how_many, org.jacorb.tao_imr.ImplementationRepository.ServerInformationListHolder server_list, org.jacorb.tao_imr.ImplementationRepository.ServerInformationIteratorHolder server_iterator);
	void shutdown(boolean activators, boolean servers);
}
