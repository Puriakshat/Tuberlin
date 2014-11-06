package org.omg.dds;


/**
 * Generated from IDL interface "ContentFilteredTopic".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ContentFilteredTopicOperations
	extends org.omg.dds.TopicDescriptionOperations
{
	/* constants */
	/* operations  */
	java.lang.String get_filter_expression();
	java.lang.String[] get_expression_parameters();
	int set_expression_parameters(java.lang.String[] expression_parameters);
	org.omg.dds.Topic get_related_topic();
}
