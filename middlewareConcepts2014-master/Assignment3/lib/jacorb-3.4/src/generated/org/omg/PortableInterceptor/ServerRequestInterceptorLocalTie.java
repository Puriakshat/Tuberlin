package org.omg.PortableInterceptor;


/**
 * Generated from IDL interface "ServerRequestInterceptor".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ServerRequestInterceptorLocalTie
	extends _ServerRequestInterceptorLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ServerRequestInterceptorOperations _delegate;

	public ServerRequestInterceptorLocalTie(ServerRequestInterceptorOperations delegate)
	{
		_delegate = delegate;
	}
	public ServerRequestInterceptorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServerRequestInterceptorOperations delegate)
	{
		_delegate = delegate;
	}
	public void receive_request(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest
	{
_delegate.receive_request(ri);
	}

	public java.lang.String name()
	{
		return _delegate.name();
	}

	public void send_other(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest
	{
_delegate.send_other(ri);
	}

	public void send_exception(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest
	{
_delegate.send_exception(ri);
	}

	public void receive_request_service_contexts(org.omg.PortableInterceptor.ServerRequestInfo ri) throws org.omg.PortableInterceptor.ForwardRequest
	{
_delegate.receive_request_service_contexts(ri);
	}

	public void send_reply(org.omg.PortableInterceptor.ServerRequestInfo ri)
	{
_delegate.send_reply(ri);
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
