package org.omg.CosTrading;

/**
 * Generated from IDL exception "UnknownOfferId".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownOfferId
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnknownOfferId()
	{
		super(org.omg.CosTrading.UnknownOfferIdHelper.id());
	}

	public java.lang.String id = "";
	public UnknownOfferId(java.lang.String _reason,java.lang.String id)
	{
		super(_reason);
		this.id = id;
	}
	public UnknownOfferId(java.lang.String id)
	{
		super(org.omg.CosTrading.UnknownOfferIdHelper.id());
		this.id = id;
	}
}
