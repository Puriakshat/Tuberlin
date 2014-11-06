package org.omg.CosTrading;

/**
 * Generated from IDL struct "Offer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Offer
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Offer(){}
	public org.omg.CORBA.Object reference;
	public org.omg.CosTrading.Property[] properties;
	public Offer(org.omg.CORBA.Object reference, org.omg.CosTrading.Property[] properties)
	{
		this.reference = reference;
		this.properties = properties;
	}
}
