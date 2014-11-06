package org.omg.dds;


/**
 * Generated from IDL interface "Subscriber".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SubscriberOperations
	extends org.omg.dds.EntityOperations
{
	/* constants */
	/* operations  */
	org.omg.dds.DataReader create_datareader(org.omg.dds.TopicDescription a_topic, org.omg.dds.DataReaderQos qos, org.omg.dds.DataReaderListener a_listener);
	int delete_datareader(org.omg.dds.DataReader a_datareader);
	int delete_contained_entities();
	org.omg.dds.DataReader lookup_datareader(java.lang.String topic_name);
	int get_datareaders(org.omg.dds.DataReaderSeqHolder readers, int sample_states, int view_states, int instance_states);
	void notify_datareaders();
	int set_qos(org.omg.dds.SubscriberQos qos);
	void get_qos(org.omg.dds.SubscriberQosHolder qos);
	int set_listener(org.omg.dds.SubscriberListener a_listener, int mask);
	org.omg.dds.SubscriberListener get_listener();
	int begin_access();
	int end_access();
	org.omg.dds.DomainParticipant get_participant();
	int set_default_datareader_qos(org.omg.dds.DataReaderQos qos);
	void get_default_datareader_qos(org.omg.dds.DataReaderQosHolder qos);
	int copy_from_topic_qos(org.omg.dds.DataReaderQosHolder a_datareader_qos, org.omg.dds.TopicQos a_topic_qos);
}
