package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Resource".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ResourceOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Vote prepare() throws org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed;
	void rollback() throws org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed,org.omg.CosTransactions.HeuristicCommit;
	void commit() throws org.omg.CosTransactions.NotPrepared,org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed,org.omg.CosTransactions.HeuristicRollback;
	void commit_one_phase() throws org.omg.CosTransactions.HeuristicHazard;
	void forget();
}
