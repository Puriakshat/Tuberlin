package org.omg.dds;


/**
 * Generated from IDL interface "QueryCondition".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface QueryConditionOperations
	extends org.omg.dds.ReadConditionOperations
{
	/* constants */
	/* operations  */
	java.lang.String get_query_expression();
	java.lang.String[] get_query_arguments();
	int set_query_arguments(java.lang.String[] query_arguments);
}
