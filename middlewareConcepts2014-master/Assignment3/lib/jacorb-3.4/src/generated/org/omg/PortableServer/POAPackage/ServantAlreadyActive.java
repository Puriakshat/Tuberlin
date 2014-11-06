package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "ServantAlreadyActive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServantAlreadyActive
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServantAlreadyActive()
	{
		super(org.omg.PortableServer.POAPackage.ServantAlreadyActiveHelper.id());
	}

	public ServantAlreadyActive(String value)
	{
		super(value);
	}
}
