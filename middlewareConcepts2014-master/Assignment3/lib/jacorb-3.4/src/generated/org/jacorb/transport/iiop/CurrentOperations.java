package org.jacorb.transport.iiop;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
 */

public interface CurrentOperations
	extends org.jacorb.transport.CurrentOperations
{
	/* constants */
	/* operations  */
	int remote_port() throws org.jacorb.transport.NoContext;
	java.lang.String remote_host() throws org.jacorb.transport.NoContext;
	int local_port() throws org.jacorb.transport.NoContext;
	java.lang.String local_host() throws org.jacorb.transport.NoContext;
}
