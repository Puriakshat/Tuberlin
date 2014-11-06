package org.omg.BridgeTransactionMgmt;

/**
 * Generated from IDL exception "TransactionActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TransactionActive
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TransactionActive()
	{
		super(org.omg.BridgeTransactionMgmt.TransactionActiveHelper.id());
	}

	public TransactionActive(String value)
	{
		super(value);
	}
}
