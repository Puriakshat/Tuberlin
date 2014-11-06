package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL interface "LockSetFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface LockSetFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosConcurrencyControl.LockSet create();
	org.omg.CosConcurrencyControl.LockSet create_related(org.omg.CosConcurrencyControl.LockSet which);
	org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional();
	org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional_related(org.omg.CosConcurrencyControl.TransactionalLockSet which);
}
