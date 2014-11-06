package org.omg.CosNotification;


/**
 * Generated from IDL interface "QoSAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface QoSAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotification.Property[] get_qos();
	void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS;
	void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS;
}
