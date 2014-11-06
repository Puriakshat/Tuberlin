package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPushSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ProxyPushSupplierOperations
	extends org.omg.CosEventComm.PushSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_push_consumer(org.omg.CosEventComm.PushConsumer push_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
}
