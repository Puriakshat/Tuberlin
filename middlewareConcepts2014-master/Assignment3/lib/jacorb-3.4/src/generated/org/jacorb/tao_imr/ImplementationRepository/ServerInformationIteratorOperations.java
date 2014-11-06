package org.jacorb.tao_imr.ImplementationRepository;


/**
 * Generated from IDL interface "ServerInformationIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ServerInformationIteratorOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, org.jacorb.tao_imr.ImplementationRepository.ServerInformationListHolder servers);
	void destroy();
}
