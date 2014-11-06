package org.omg.CosTransactions;


/**
 * Generated from IDL interface "RecoveryCoordinator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface RecoveryCoordinatorOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Status replay_completion(org.omg.CosTransactions.Resource r) throws org.omg.CosTransactions.NotPrepared;
}
