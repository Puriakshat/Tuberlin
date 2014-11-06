package org.omg.CosBridgeAdmin;


/**
 * Generated from IDL interface "Bridge".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface BridgeOperations
{
	/* constants */
	/* operations  */
	org.omg.CosBridgeAdmin.ExternalEndpoint end_point_receiver();
	org.omg.CosBridgeAdmin.ExternalEndpoint end_point_sender();
	void start_bridge() throws org.omg.CosBridgeAdmin.BridgeAlreadyStarted,org.omg.CosBridgeAdmin.InvalidExternalEndPoints;
	void stop_bridge() throws org.omg.CosBridgeAdmin.BridgeInactive;
	void destroy();
}
