package org.omg.Messaging;


/**
 * Generated from IDL interface "MaxHopsPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class MaxHopsPolicyLocalTie
	extends _MaxHopsPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private MaxHopsPolicyOperations _delegate;

	public MaxHopsPolicyLocalTie(MaxHopsPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public MaxHopsPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MaxHopsPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public short max_hops()
	{
		return _delegate.max_hops();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
