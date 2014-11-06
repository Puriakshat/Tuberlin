package org.omg.CosEventComm;


/**
 * Generated from IDL interface "PullSupplier".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface PullSupplierOperations
{
	/* constants */
	/* operations  */
	org.omg.CORBA.Any pull() throws org.omg.CosEventComm.Disconnected;
	org.omg.CORBA.Any try_pull(org.omg.CORBA.BooleanHolder has_event) throws org.omg.CosEventComm.Disconnected;
	void disconnect_pull_supplier();
}
