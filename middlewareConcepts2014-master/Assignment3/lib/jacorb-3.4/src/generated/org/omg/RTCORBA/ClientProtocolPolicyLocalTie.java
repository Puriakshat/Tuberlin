package org.omg.RTCORBA;


/**
 * Generated from IDL interface "ClientProtocolPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ClientProtocolPolicyLocalTie
	extends _ClientProtocolPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ClientProtocolPolicyOperations _delegate;

	public ClientProtocolPolicyLocalTie(ClientProtocolPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ClientProtocolPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ClientProtocolPolicyOperations delegate)
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

	public org.omg.RTCORBA.Protocol[] protocols()
	{
		return _delegate.protocols();
	}

}
