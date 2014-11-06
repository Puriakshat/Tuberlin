package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "StructuredProxyPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface StructuredProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.StructuredPullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_structured_pull_consumer(org.omg.CosNotifyComm.StructuredPullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
