package org.omg.CosNotifyChannelAdmin;


/**
 * Generated from IDL interface "SequenceProxyPullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SequenceProxyPullSupplierOperations
	extends org.omg.CosNotifyChannelAdmin.ProxySupplierOperations , org.omg.CosNotifyComm.SequencePullSupplierOperations
{
	/* constants */
	/* operations  */
	void connect_sequence_pull_consumer(org.omg.CosNotifyComm.SequencePullConsumer pull_consumer) throws org.omg.CosEventChannelAdmin.AlreadyConnected;
}
