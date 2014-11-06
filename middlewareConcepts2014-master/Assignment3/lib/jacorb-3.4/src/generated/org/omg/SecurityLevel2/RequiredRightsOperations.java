package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "RequiredRights".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface RequiredRightsOperations
{
	/* constants */
	/* operations  */
	void get_required_rights(org.omg.CORBA.Object obj, java.lang.String operation_name, java.lang.String interface_name, org.omg.Security.RightsListHolder rights, org.omg.Security.RightsCombinatorHolder rights_combinator);
	void set_required_rights(java.lang.String operation_name, java.lang.String interface_name, org.omg.Security.Right[] rights, org.omg.Security.RightsCombinator rights_combinator);
}
