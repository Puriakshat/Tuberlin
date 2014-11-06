package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface CurrentOperations
	extends org.omg.CORBA.CurrentOperations
{
	/* constants */
	/* operations  */
	void begin() throws org.omg.CosTransactions.SubtransactionsUnavailable;
	void commit(boolean report_heuristics) throws org.omg.CosTransactions.NoTransaction,org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed;
	void rollback() throws org.omg.CosTransactions.NoTransaction;
	void rollback_only() throws org.omg.CosTransactions.NoTransaction;
	org.omg.CosTransactions.Status get_status();
	java.lang.String get_transaction_name();
	void set_timeout(int seconds);
	org.omg.CosTransactions.Control get_control();
	org.omg.CosTransactions.Control suspend();
	void resume(org.omg.CosTransactions.Control which) throws org.omg.CosTransactions.InvalidControl;
}
