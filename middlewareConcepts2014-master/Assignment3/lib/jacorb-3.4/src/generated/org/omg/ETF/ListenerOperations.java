package org.omg.ETF;


/**
 * Generated from IDL interface "Listener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ListenerOperations
{
	/* constants */
	/* operations  */
	void set_handle(org.omg.ETF.Handle up);
	org.omg.ETF.Connection accept();
	void listen();
	void destroy();
	void completed_data(org.omg.ETF.Connection conn);
	org.omg.ETF.Profile endpoint();
}
