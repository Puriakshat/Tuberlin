package org.omg.RTCORBA;


/**
 * Generated from IDL interface "PriorityModelPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class PriorityModelPolicyLocalTie
	extends _PriorityModelPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private PriorityModelPolicyOperations _delegate;

	public PriorityModelPolicyLocalTie(PriorityModelPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public PriorityModelPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PriorityModelPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public short server_priority()
	{
		return _delegate.server_priority();
	}

	public int policy_type()
	{
		return _delegate.policy_type();
	}

	public org.omg.CORBA.Policy copy()
	{
		return _delegate.copy();
	}

	public org.omg.RTCORBA.PriorityModel priority_model()
	{
		return _delegate.priority_model();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
