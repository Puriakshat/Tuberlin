package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "DomainAccessPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface DomainAccessPolicyOperations
	extends org.omg.SecurityAdmin.AccessPolicyOperations
{
	/* constants */
	/* operations  */
	void grant_rights(org.omg.Security.SecAttribute priv_attr, org.omg.Security.DelegationState del_state, org.omg.Security.Right[] rights);
	void revoke_rights(org.omg.Security.SecAttribute priv_attr, org.omg.Security.DelegationState del_state, org.omg.Security.Right[] rights);
	void replace_rights(org.omg.Security.SecAttribute priv_attr, org.omg.Security.DelegationState del_state, org.omg.Security.Right[] rights);
	org.omg.Security.Right[] get_rights(org.omg.Security.SecAttribute priv_attr, org.omg.Security.DelegationState del_state, org.omg.Security.ExtensibleFamily rights_family);
	org.omg.Security.Right[] get_all_rights(org.omg.Security.SecAttribute priv_attr, org.omg.Security.DelegationState del_state);
}
