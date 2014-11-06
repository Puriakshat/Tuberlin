package org.omg.RTCORBA;


/**
 * Generated from IDL interface "ServerProtocolPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class ServerProtocolPolicyLocalTie
	extends _ServerProtocolPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private ServerProtocolPolicyOperations _delegate;

	public ServerProtocolPolicyLocalTie(ServerProtocolPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public ServerProtocolPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServerProtocolPolicyOperations delegate)
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
