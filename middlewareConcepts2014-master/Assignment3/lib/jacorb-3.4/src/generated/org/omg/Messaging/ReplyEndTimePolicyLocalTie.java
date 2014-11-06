package org.omg.Messaging;


/**
 * Generated from IDL interface "ReplyEndTimePolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ReplyEndTimePolicyLocalTie
	extends _ReplyEndTimePolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ReplyEndTimePolicyOperations _delegate;

	public ReplyEndTimePolicyLocalTie(ReplyEndTimePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ReplyEndTimePolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ReplyEndTimePolicyOperations delegate)
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

	public org.omg.TimeBase.UtcT end_time()
	{
		return _delegate.end_time();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
