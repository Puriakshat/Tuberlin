package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ORBInitInfo_3_1".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ORBInitInfo_3_1Operations
	extends org.omg.PortableInterceptor.ORBInitInfoOperations
{
	/* constants */
	/* operations  */
	void add_client_request_interceptor_with_policy(org.omg.PortableInterceptor.ClientRequestInterceptor interceptor, org.omg.CORBA.Policy[] policies) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName,org.omg.CORBA.PolicyError;
	void add_server_request_interceptor_with_policy(org.omg.PortableInterceptor.ServerRequestInterceptor interceptor, org.omg.CORBA.Policy[] policies) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName,org.omg.CORBA.PolicyError;
	void add_ior_interceptor_with_policy(org.omg.PortableInterceptor.IORInterceptor interceptor, org.omg.CORBA.Policy[] policies) throws org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName,org.omg.CORBA.PolicyError;
}
