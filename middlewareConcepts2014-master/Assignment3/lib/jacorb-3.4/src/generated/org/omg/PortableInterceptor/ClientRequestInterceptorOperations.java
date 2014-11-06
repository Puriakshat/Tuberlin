package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ClientRequestInterceptor".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ClientRequestInterceptorOperations
	extends org.omg.PortableInterceptor.InterceptorOperations
{
	/* constants */
	/* operations  */
	void send_request(org.omg.PortableInterceptor.ClientRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void send_poll(org.omg.PortableInterceptor.ClientRequestInfo ri);
	void receive_reply(org.omg.PortableInterceptor.ClientRequestInfo ri);
	void receive_exception(org.omg.PortableInterceptor.ClientRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
	void receive_other(org.omg.PortableInterceptor.ClientRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest;
}
