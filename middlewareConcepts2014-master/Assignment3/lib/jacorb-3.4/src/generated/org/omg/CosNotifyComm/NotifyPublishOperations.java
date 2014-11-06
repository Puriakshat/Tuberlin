package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "NotifyPublish".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface NotifyPublishOperations
{
	/* constants */
	/* operations  */
	void offer_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType;
}
