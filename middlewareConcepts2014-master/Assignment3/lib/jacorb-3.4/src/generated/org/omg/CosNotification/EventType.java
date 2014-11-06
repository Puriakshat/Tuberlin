package org.omg.CosNotification;

/**
 * Generated from IDL struct "EventType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EventType
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EventType(){}
	public java.lang.String domain_name = "";
	public java.lang.String type_name = "";
	public EventType(java.lang.String domain_name, java.lang.String type_name)
	{
		this.domain_name = domain_name;
		this.type_name = type_name;
	}
}
