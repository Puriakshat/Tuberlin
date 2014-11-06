package org.omg.PortableServer;


/**
 * Generated from IDL interface "RequestProcessingPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class RequestProcessingPolicyLocalTie
	extends _RequestProcessingPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private RequestProcessingPolicyOperations _delegate;

	public RequestProcessingPolicyLocalTie(RequestProcessingPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RequestProcessingPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RequestProcessingPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.RequestProcessingPolicyValue value()
	{
		return _delegate.value();
	}

	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
