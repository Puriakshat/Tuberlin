package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "PolicyFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface PolicyFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Policy create_policy(int type, org.omg.CORBA.Any value) throws org.omg.CORBA.PolicyError;
}
