package org.omg.PortableServer;


/**
 * Generated from IDL interface "IdAssignmentPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class IdAssignmentPolicyLocalTie
	extends _IdAssignmentPolicyLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private IdAssignmentPolicyOperations _delegate;

	public IdAssignmentPolicyLocalTie(IdAssignmentPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public IdAssignmentPolicyOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IdAssignmentPolicyOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.PortableServer.IdAssignmentPolicyValue value()
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
