package org.omg.CosTypedNotifyChannelAdmin;


/**
 * Generated from IDL interface "TypedEventChannelFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TypedEventChannelFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel create_typed_channel(org.omg.CosNotification.Property[] initial_QoS, org.omg.CosNotification.Property[] initial_admin, org.omg.CORBA.IntHolder id) throws org.omg.CosNotification.UnsupportedAdmin,org.omg.CosNotification.UnsupportedQoS;
	int[] get_all_typed_channels();
	org.omg.CosTypedNotifyChannelAdmin.TypedEventChannel get_typed_event_channel(int id) throws org.omg.CosNotifyChannelAdmin.ChannelNotFound;
}
