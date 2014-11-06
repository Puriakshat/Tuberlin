package org.omg.dds;


/**
 * Generated from IDL interface "StatusCondition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface StatusConditionOperations
	extends org.omg.dds.ConditionOperations
{
	/* constants */
	/* operations  */
	int get_enabled_statuses();
	int set_enabled_statuses(int mask);
	org.omg.dds.Entity get_entity();
}
