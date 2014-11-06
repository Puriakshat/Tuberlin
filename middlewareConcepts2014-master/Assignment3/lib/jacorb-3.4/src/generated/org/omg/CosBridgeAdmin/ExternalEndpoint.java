package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL struct "ExternalEndpoint".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExternalEndpoint
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ExternalEndpoint(){}
	public org.omg.CosBridgeAdmin.ExternalEndpointRole role;
	public org.omg.CosBridgeAdmin.ExternalEndpointConnector connector;
	public org.omg.CosBridgeAdmin.FlowStyle style;
	public org.omg.CosBridgeAdmin.MessageType type;
	public ExternalEndpoint(org.omg.CosBridgeAdmin.ExternalEndpointRole role, org.omg.CosBridgeAdmin.ExternalEndpointConnector connector, org.omg.CosBridgeAdmin.FlowStyle style, org.omg.CosBridgeAdmin.MessageType type)
	{
		this.role = role;
		this.connector = connector;
		this.style = style;
		this.type = type;
	}
}
