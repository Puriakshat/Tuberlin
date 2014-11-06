package org.omg.PortableServer;


/**
 * Generated from IDL interface "LifespanPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class LifespanPolicyLocalTie
	extends _LifespanPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private LifespanPolicyOperations _delegate;

	public LifespanPolicyLocalTie(LifespanPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public LifespanPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(LifespanPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.LifespanPolicyValue value()
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
