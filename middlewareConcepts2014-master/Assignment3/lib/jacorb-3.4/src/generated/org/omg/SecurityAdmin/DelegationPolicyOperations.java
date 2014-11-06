package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "DelegationPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface DelegationPolicyOperations
	extends org.omg.CORBA.PolicyOperations
{
	/* constants */
	/* operations  */
	void set_delegation_mode(org.omg.CORBA.InterfaceDef object_type, org.omg.Security.DelegationMode mode);
	org.omg.Security.DelegationMode get_delegation_mode(org.omg.CORBA.InterfaceDef object_type);
}
