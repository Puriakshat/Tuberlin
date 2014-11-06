package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Synchronization".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SynchronizationOperations
	extends org.omg.CosTransactions.TransactionalObjectOperations
{
	/* constants */
	/* operations  */
	void before_completion();
	void after_completion(org.omg.CosTransactions.Status status_);
}
