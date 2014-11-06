package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "StructuredProxyPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface StructuredProxyPushConsumerOperations
	extends org.omg.CosNotifyChannelAdmin.ProxyConsumerOperations , org.omg.CosNotifyComm.StructuredPushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_structured_push_supplier(org.omg.CosNotifyComm.StructuredPushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
