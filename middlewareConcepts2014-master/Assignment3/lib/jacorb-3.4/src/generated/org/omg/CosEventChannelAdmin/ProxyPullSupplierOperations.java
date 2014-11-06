package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "ProxyPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ProxyPullSupplierOperations
	extends org.omg.CosEventComm.PullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_pull_consumer(org.omg.CosEventComm.PullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
