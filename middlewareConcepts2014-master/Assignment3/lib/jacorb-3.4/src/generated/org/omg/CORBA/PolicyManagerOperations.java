package org.omg.CORBA;


/**
 * Generated from IDL interface "PolicyManager".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface PolicyManagerOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Policy[] get_policy_overrides(int[] ts);
	void set_policy_overrides(org.omg.CORBA.Policy[] policies, org.omg.CORBA.SetOverrideType set_add) throws org.omg.CORBA.InvalidPolicies;
}
