package org.omg.Messaging;


/**
 * Generated from IDL interface "QueueOrderPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class QueueOrderPolicyLocalTie
	extends _QueueOrderPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private QueueOrderPolicyOperations _delegate;

	public QueueOrderPolicyLocalTie(QueueOrderPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public QueueOrderPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QueueOrderPolicyOperations delegate)
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

	public void destroy()
	{
_delegate.destroy();
	}

	public short allowed_orders()
	{
		return _delegate.allowed_orders();
	}

}
