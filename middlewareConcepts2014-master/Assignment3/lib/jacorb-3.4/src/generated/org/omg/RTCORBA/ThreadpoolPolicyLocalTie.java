package org.omg.RTCORBA;


/**
 * Generated from IDL interface "ThreadpoolPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ThreadpoolPolicyLocalTie
	extends _ThreadpoolPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ThreadpoolPolicyOperations _delegate;

	public ThreadpoolPolicyLocalTie(ThreadpoolPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ThreadpoolPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ThreadpoolPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public int threadpool()
	{
		return _delegate.threadpool();
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
