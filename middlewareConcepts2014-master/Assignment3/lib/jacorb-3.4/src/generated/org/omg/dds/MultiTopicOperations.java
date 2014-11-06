package org.omg.dds;


/**
 * Generated from IDL interface "MultiTopic".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface MultiTopicOperations
	extends org.omg.dds.TopicDescriptionOperations
{
	/* constants */
	/* operations  */
	java.lang.String get_subscription_expression();
	java.lang.String[] get_expression_parameters();
	int set_expression_parameters(java.lang.String[] expression_parameters);
}
