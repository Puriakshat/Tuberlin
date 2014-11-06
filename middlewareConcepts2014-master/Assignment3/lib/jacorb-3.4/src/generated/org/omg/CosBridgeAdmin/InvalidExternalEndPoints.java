package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL exception "InvalidExternalEndPoints".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidExternalEndPoints
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public InvalidExternalEndPoints()
	{
		super(org.omg.CosBridgeAdmin.InvalidExternalEndPointsHelper.id());
	}

	public org.omg.CosBridgeAdmin.ExternalEndpointError[] error;
	public InvalidExternalEndPoints(java.lang.String _reason,org.omg.CosBridgeAdmin.ExternalEndpointError[] error)
	{
		super(_reason);
		this.error = error;
	}
	public InvalidExternalEndPoints(org.omg.CosBridgeAdmin.ExternalEndpointError[] error)
	{
		super(org.omg.CosBridgeAdmin.InvalidExternalEndPointsHelper.id());
		this.error = error;
	}
}
