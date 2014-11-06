package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "AccessDecision".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface AccessDecisionOperations
{
	/* constants */
	/* operations  */
	boolean access_allowed(org.omg.SecurityLevel2.Credentials[] cred_list, org.omg.CORBA.Object target, java.lang.String operation_name, java.lang.String target_interface_name);
}
