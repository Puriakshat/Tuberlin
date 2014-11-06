package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ServerRequestInterceptor".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ServerRequestInterceptorOperations
	extends org.omg.PortableInterceptor.InterceptorOperations
{
	/* constants */
	/* operations  */
	void receive_request_service_contexts(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void receive_request(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void send_reply(org.omg.PortableInterceptor.ServerRequestInfo ri);
	void send_exception(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void send_other(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
}
