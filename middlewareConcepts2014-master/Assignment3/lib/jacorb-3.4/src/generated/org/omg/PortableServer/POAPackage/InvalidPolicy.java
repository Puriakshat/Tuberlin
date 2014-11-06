package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "InvalidPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidPolicy
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public InvalidPolicy()
	{
		super(org.omg.PortableServer.POAPackage.InvalidPolicyHelper.id());
	}

	public short index;
	public InvalidPolicy(java.lang.String _reason,short index)
	{
		super(_reason);
		this.index = index;
	}
	public InvalidPolicy(short index)
	{
		super(org.omg.PortableServer.POAPackage.InvalidPolicyHelper.id());
		this.index = index;
	}
}
