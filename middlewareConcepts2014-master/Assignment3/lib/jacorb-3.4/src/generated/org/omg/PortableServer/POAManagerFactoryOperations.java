package org.omg.PortableServer;


/**
 * Generated from IDL interface "POAManagerFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface POAManagerFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.PortableServer.POAManager create_POAManager(java.lang.String id, org.omg.CORBA.Policy[] policies) throws org.omg.PortableServer.POAManagerFactoryPackage.ManagerAlreadyExists,org.omg.CORBA.PolicyError;
	org.omg.PortableServer.POAManager[] list();
	org.omg.PortableServer.POAManager find(java.lang.String id);
}
