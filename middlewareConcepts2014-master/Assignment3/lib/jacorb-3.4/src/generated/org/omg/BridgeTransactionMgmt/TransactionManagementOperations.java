package org.omg.BridgeTransactionMgmt;


/**
 * Generated from IDL interface "TransactionManagement".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TransactionManagementOperations
{
	/* constants */
	/* operations  */
	void enable_transaction(int events, int timeout) throws org.omg.BridgeTransactionMgmt.TransactionAlreadyActive,org.omg.BridgeTransactionMgmt.UnsupportedTransaction;
	void disable_transaction() throws org.omg.BridgeTransactionMgmt.TransactionActive;
}
