package org.omg.ETF;


/**
 * Generated from IDL interface "Handle".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface HandleOperations
{
	/* constants */
	/* operations  */
	boolean add_input(org.omg.ETF.Connection conn);
	void signal_data_available(org.omg.ETF.Connection conn);
	void closed_by_peer(org.omg.ETF.Connection conn);
}
