package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "AdapterNonExistent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AdapterNonExistent
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AdapterNonExistent()
	{
		super(org.omg.PortableServer.POAPackage.AdapterNonExistentHelper.id());
	}

	public AdapterNonExistent(String value)
	{
		super(value);
	}
}
