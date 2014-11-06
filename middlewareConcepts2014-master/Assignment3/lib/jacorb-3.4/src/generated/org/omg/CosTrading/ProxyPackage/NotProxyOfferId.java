package org.omg.CosTrading.ProxyPackage;

/**
 * Generated from IDL exception "NotProxyOfferId".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NotProxyOfferId
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NotProxyOfferId()
	{
		super(org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.id());
	}

	public java.lang.String id = "";
	public NotProxyOfferId(java.lang.String _reason,java.lang.String id)
	{
		super(_reason);
		this.id = id;
	}
	public NotProxyOfferId(java.lang.String id)
	{
		super(org.omg.CosTrading.ProxyPackage.NotProxyOfferIdHelper.id());
		this.id = id;
	}
}
