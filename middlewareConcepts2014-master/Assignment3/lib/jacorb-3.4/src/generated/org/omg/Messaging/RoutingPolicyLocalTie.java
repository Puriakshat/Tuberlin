package org.omg.Messaging;


/**
 * Generated from IDL interface "RoutingPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class RoutingPolicyLocalTie
	extends _RoutingPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private RoutingPolicyOperations _delegate;

	public RoutingPolicyLocalTie(RoutingPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RoutingPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RoutingPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.Messaging.RoutingTypeRange routing_range()
	{
		return _delegate.routing_range();
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
