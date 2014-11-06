package org.omg.Messaging;


/**
 * Generated from IDL interface "RebindPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class RebindPolicyLocalTie
	extends _RebindPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private RebindPolicyOperations _delegate;

	public RebindPolicyLocalTie(RebindPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public RebindPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RebindPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public short rebind_mode()
	{
		return _delegate.rebind_mode();
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
