package org.omg.BridgeTransactionMgmt;

/**
 * Generated from IDL exception "TransactionAlreadyActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TransactionAlreadyActive
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TransactionAlreadyActive()
	{
		super(org.omg.BridgeTransactionMgmt.TransactionAlreadyActiveHelper.id());
	}

	public TransactionAlreadyActive(String value)
	{
		super(value);
	}
}
