package org.omg.CosNotifyComm;


/**
 * Generated from IDL interface "StructuredPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface StructuredPullSupplierOperations
	extends org.omg.CosNotifyComm.NotifySubscribeOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotification.StructuredEvent pull_structured_event() throws org.omg.CosEventComm.Disconnected;
	org.omg.CosNotification.StructuredEvent try_pull_structured_event(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected;
	void disconnect_structured_pull_supplier();
}
