package org.omg.CosTypedEventChannelAdmin;


/**
 * Generated from IDL interface "TypedConsumerAdmin".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TypedConsumerAdminOperations
	extends org.omg.CosEventChannelAdmin.ConsumerAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTypedEventChannelAdmin.TypedProxyPullSupplier obtain_typed_pull_supplier(java.lang.String supported_interface) throws org.omg.CosTypedEventChannelAdmin.InterfaceNotSupported;
	org.omg.CosEventChannelAdmin.ProxyPushSupplier obtain_typed_push_supplier(java.lang.String uses_interface) throws org.omg.CosTypedEventChannelAdmin.NoSuchImplementation;
}
