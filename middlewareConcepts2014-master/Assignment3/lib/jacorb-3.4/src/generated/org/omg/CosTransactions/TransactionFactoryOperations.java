package org.omg.CosTransactions;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface TransactionFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Control create(int time_out);
	org.omg.CosTransactions.Control recreate(org.omg.CosTransactions.PropagationContext ctx);
}
