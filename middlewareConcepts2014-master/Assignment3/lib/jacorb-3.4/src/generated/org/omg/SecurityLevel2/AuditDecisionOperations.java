package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "AuditDecision".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface AuditDecisionOperations
{
	/* constants */
	/* operations  */
	boolean audit_needed(org.omg.Security.AuditEventType event_type, org.omg.Security.SelectorValue[] value_list);
	org.omg.SecurityLevel2.AuditChannel audit_channel();
}
