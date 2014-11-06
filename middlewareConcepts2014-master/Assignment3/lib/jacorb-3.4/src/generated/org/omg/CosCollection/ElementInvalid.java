package org.omg.CosCollection;

/**
 * Generated from IDL exception "ElementInvalid".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ElementInvalid
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ElementInvalid()
	{
		super(org.omg.CosCollection.ElementInvalidHelper.id());
	}

	public org.omg.CosCollection.ElementInvalidReason why;
	public ElementInvalid(java.lang.String _reason,org.omg.CosCollection.ElementInvalidReason why)
	{
		super(_reason);
		this.why = why;
	}
	public ElementInvalid(org.omg.CosCollection.ElementInvalidReason why)
	{
		super(org.omg.CosCollection.ElementInvalidHelper.id());
		this.why = why;
	}
}
