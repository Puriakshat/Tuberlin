package org.omg.CosTrading;

/**
 * Generated from IDL exception "IllegalOfferId".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IllegalOfferId
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IllegalOfferId()
	{
		super(org.omg.CosTrading.IllegalOfferIdHelper.id());
	}

	public java.lang.String id = "";
	public IllegalOfferId(java.lang.String _reason,java.lang.String id)
	{
		super(_reason);
		this.id = id;
	}
	public IllegalOfferId(java.lang.String id)
	{
		super(org.omg.CosTrading.IllegalOfferIdHelper.id());
		this.id = id;
	}
}
