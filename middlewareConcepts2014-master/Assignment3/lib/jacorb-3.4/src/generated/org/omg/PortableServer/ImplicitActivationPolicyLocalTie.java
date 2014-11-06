package org.omg.PortableServer;


/**
 * Generated from IDL interface "ImplicitActivationPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ImplicitActivationPolicyLocalTie
	extends _ImplicitActivationPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ImplicitActivationPolicyOperations _delegate;

	public ImplicitActivationPolicyLocalTie(ImplicitActivationPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ImplicitActivationPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ImplicitActivationPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.ImplicitActivationPolicyValue value()
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
