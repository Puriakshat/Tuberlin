package org.omg.dds;


/**
 * Generated from IDL interface "ReadCondition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ReadConditionOperations
	extends org.omg.dds.ConditionOperations
{
	/* constants */
	/* operations  */
	int get_sample_state_mask();
	int get_view_state_mask();
	int get_instance_state_mask();
	org.omg.dds.DataReader get_datareader();
}
