package org.omg.CosTransactions;


/**
 * Generated from IDL interface "SubtransactionAwareResource".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SubtransactionAwareResourceOperations
	extends org.omg.CosTransactions.ResourceOperations
{
	/* constants */
	/* operations  */
	void commit_subtransaction(org.omg.CosTransactions.Coordinator parent);
	void rollback_subtransaction();
}
