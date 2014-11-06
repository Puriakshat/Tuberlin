package org.omg.CosTypedEventChannelAdmin;


/**
 * Generated from IDL interface "TypedEventChannel".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TypedEventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTypedEventChannelAdmin.TypedConsumerAdmin for_consumers();
	org.omg.CosTypedEventChannelAdmin.TypedSupplierAdmin for_suppliers();
	void destroy();
}
