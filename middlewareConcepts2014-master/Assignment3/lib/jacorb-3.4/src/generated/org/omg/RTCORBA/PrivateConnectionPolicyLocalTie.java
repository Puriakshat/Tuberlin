package org.omg.RTCORBA;


/**
 * Generated from IDL interface "PrivateConnectionPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class PrivateConnectionPolicyLocalTie
	extends _PrivateConnectionPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private PrivateConnectionPolicyOperations _delegate;

	public PrivateConnectionPolicyLocalTie(PrivateConnectionPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public PrivateConnectionPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PrivateConnectionPolicyOperations delegate)
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

}
