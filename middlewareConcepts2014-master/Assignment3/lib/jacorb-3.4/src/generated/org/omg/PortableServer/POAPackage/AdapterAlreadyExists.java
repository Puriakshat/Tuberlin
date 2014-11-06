package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "AdapterAlreadyExists".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AdapterAlreadyExists
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AdapterAlreadyExists()
	{
		super(org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper.id());
	}

	public AdapterAlreadyExists(String value)
	{
		super(value);
	}
}
