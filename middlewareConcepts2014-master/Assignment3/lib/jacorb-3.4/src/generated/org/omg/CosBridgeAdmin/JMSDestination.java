package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL struct "JMSDestination".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class JMSDestination
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public JMSDestination(){}
	public org.omg.CosBridgeAdmin.JMSDestinationType destination_type;
	public java.lang.String destination_name = "";
	public java.lang.String factory_name = "";
	public JMSDestination(org.omg.CosBridgeAdmin.JMSDestinationType destination_type, java.lang.String destination_name, java.lang.String factory_name)
	{
		this.destination_type = destination_type;
		this.destination_name = destination_name;
		this.factory_name = factory_name;
	}
}
