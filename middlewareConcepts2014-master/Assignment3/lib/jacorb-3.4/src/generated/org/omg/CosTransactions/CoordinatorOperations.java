package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Coordinator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface CoordinatorOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Status get_status();
	org.omg.CosTransactions.Status get_parent_status();
	org.omg.CosTransactions.Status get_top_level_status();
	boolean is_same_transaction(org.omg.CosTransactions.Coordinator tc);
	boolean is_related_transaction(org.omg.CosTransactions.Coordinator tc);
	boolean is_ancestor_transaction(org.omg.CosTransactions.Coordinator tc);
	boolean is_descendant_transaction(org.omg.CosTransactions.Coordinator tc);
	boolean is_top_level_transaction();
	int hash_transaction();
	int hash_top_level_tran();
	org.omg.CosTransactions.RecoveryCoordinator register_resource(org.omg.CosTransactions.Resource r) throws org.omg.CosTransactions.Inactive;
	void register_synchronization(org.omg.CosTransactions.Synchronization sync) throws org.omg.CosTransactions.SynchronizationUnavailable,org.omg.CosTransactions.Inactive;
	void register_subtran_aware(org.omg.CosTransactions.SubtransactionAwareResource r) throws org.omg.CosTransactions.NotSubtransaction,org.omg.CosTransactions.Inactive;
	void rollback_only() throws org.omg.CosTransactions.Inactive;
	java.lang.String get_transaction_name();
	org.omg.CosTransactions.Control create_subtransaction() throws org.omg.CosTransactions.SubtransactionsUnavailable,org.omg.CosTransactions.Inactive;
	org.omg.CosTransactions.PropagationContext get_txcontext() throws org.omg.CosTransactions.Unavailable;
}
