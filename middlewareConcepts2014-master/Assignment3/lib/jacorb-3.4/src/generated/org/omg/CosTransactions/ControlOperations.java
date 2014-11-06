package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Control".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ControlOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Terminator get_terminator() throws org.omg.CosTransactions.Unavailable;
	org.omg.CosTransactions.Coordinator get_coordinator() throws org.omg.CosTransactions.Unavailable;
}
