package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "BridgeFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface BridgeFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosBridgeAdmin.Bridge create_bridge(org.omg.CosBridgeAdmin.ExternalEndpoint source, org.omg.CosBridgeAdmin.ExternalEndpoint sink, org.omg.CORBA.IntHolder id) throws org.omg.CosBridgeAdmin.InvalidExternalEndPoints;
	org.omg.CosBridgeAdmin.Bridge get_bridge_with_id(int id) throws org.omg.CosBridgeAdmin.BridgeNotFound;
	int[] get_all_bridges();
}
