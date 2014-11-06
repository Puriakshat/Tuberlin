package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Terminator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TerminatorOperations
{
	/* constants */
	/* operations  */
	void commit(boolean report_heuristics) throws org.omg.CosTransactions.HeuristicHazard,org.omg.CosTransactions.HeuristicMixed;
	void rollback();
}
