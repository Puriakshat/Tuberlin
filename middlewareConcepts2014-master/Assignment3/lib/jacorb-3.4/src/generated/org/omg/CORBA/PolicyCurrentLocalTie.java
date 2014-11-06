package org.omg.CORBA;


/**
 * Generated from IDL interface "PolicyCurrent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public class PolicyCurrentLocalTie
	extends _PolicyCurrentLocalBase
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private PolicyCurrentOperations _delegate;

	public PolicyCurrentLocalTie(PolicyCurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public PolicyCurrentOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PolicyCurrentOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CORBA.Policy[] get_policy_overrides(int[] ts)
	{
		return _delegate.get_policy_overrides(ts);
	}

	public void set_policy_overrides(org.omg.CORBA.Policy[] policies, org.omg.CORBA.SetOverrideType set_add) throws org.omg.CORBA.InvalidPolicies
	{
_delegate.set_policy_overrides(policies,set_add);
	}

}
