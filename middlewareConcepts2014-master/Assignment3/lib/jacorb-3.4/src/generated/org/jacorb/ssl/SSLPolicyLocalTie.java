package org.jacorb.ssl;


/**
 * Generated from IDL interface "SSLPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class SSLPolicyLocalTie
	extends _SSLPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private SSLPolicyOperations _delegate;

	public SSLPolicyLocalTie(SSLPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public SSLPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(SSLPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.jacorb.ssl.SSLPolicyValue value()
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
