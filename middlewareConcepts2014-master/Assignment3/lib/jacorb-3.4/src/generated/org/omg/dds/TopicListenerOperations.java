package org.omg.dds;


/**
 * Generated from IDL interface "TopicListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TopicListenerOperations
	extends org.omg.dds.ListenerOperations
{
	/* constants */
	/* operations  */
	void on_inconsistent_topic(org.omg.dds.Topic the_topic, org.omg.dds.InconsistentTopicStatus status);
}
