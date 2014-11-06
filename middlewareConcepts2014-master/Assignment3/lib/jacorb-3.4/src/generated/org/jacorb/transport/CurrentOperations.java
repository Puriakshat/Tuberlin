package org.jacorb.transport;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
 */

public interface CurrentOperations
{
	/* constants */
	/* operations  */
	int id() throws org.jacorb.transport.NoContext;
	long bytes_sent() throws org.jacorb.transport.NoContext;
	long bytes_received() throws org.jacorb.transport.NoContext;
	long messages_sent() throws org.jacorb.transport.NoContext;
	long messages_received() throws org.jacorb.transport.NoContext;
	long open_since() throws org.jacorb.transport.NoContext;
}
