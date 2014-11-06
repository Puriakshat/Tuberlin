package org.jacorb.imr;


/**
 * Generated from IDL interface "ServerStartupDaemon".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ServerStartupDaemonOperations
{
	/* constants */
	/* operations  */
	int get_system_load();
	void start_server(java.lang.String command) throws org.jacorb.imr.ServerStartupFailed;
}
