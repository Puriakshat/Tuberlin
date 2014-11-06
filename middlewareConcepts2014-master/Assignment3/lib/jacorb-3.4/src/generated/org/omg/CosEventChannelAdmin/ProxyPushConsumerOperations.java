package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ProxyPushConsumerOperations
	extends org.omg.CosEventComm.PushConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_push_supplier(org.omg.CosEventComm.PushSupplier push_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
