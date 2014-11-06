package org.omg.Messaging;


/**
 * Generated from IDL interface "SyncScopePolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SyncScopePolicyLocalTie
	extends _SyncScopePolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private SyncScopePolicyOperations _delegate;

	public SyncScopePolicyLocalTie(SyncScopePolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public SyncScopePolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SyncScopePolicyOperations delegate)
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

	public short synchronization()
	{
		return _delegate.synchronization();
	}

	public void destroy()
	{
_delegate.destroy();
	}

}
