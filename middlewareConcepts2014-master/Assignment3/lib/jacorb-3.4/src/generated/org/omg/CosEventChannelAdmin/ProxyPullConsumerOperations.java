package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPullConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ProxyPullConsumerOperations
	extends org.omg.CosEventComm.PullConsumerOperations
{
	/* constants */
	/* operations  */
	void connect_pull_supplier(org.omg.CosEventComm.PullSupplier pull_supplier) throws org.omg.CosEventChannelAdmin.AlreadyConnected,org.omg.CosEventChannelAdmin.TypeError;
}
