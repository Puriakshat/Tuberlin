package org.omg.CORBA;

/**
 * Generated from IDL exception "BadFixedValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BadFixedValue
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public BadFixedValue()
	{
		super(org.omg.CORBA.BadFixedValueHelper.id());
	}

	public int offset;
	public BadFixedValue(java.lang.String _reason,int offset)
	{
		super(_reason);
		this.offset = offset;
	}
	public BadFixedValue(int offset)
	{
		super(org.omg.CORBA.BadFixedValueHelper.id());
		this.offset = offset;
	}
}
