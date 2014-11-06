package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "NotifySubscribe".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface NotifySubscribeOperations
{
	/* constants */
	/* operations  */
	void subscription_change(org.omg.CosNotification.EventType[] added, org.omg.CosNotification.EventType[] removed) throws org.omg.CosNotifyComm.InvalidEventType;
}
