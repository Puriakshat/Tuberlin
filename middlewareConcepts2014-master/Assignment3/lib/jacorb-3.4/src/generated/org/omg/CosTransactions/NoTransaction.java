package org.omg.CosTransactions;

/**
 * Generated from IDL exception "NoTransaction".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NoTransaction
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NoTransaction()
	{
		super(org.omg.CosTransactions.NoTransactionHelper.id());
	}

	public NoTransaction(String value)
	{
		super(value);
	}
}
