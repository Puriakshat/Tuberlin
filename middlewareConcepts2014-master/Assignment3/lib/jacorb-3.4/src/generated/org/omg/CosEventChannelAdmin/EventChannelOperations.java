package org.omg.CosEventChannelAdmin;


/**
 * Generated from IDL interface "EventChannel".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface EventChannelOperations
{
	/* constants */
	/* operations  */
	org.omg.CosEventChannelAdmin.ConsumerAdmin for_consumers();
	org.omg.CosEventChannelAdmin.SupplierAdmin for_suppliers();
	void destroy();
}
