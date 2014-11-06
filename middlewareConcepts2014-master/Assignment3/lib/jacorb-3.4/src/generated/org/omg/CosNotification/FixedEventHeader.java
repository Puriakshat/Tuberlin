package org.omg.CosNotification;

/**
 * Generated from IDL struct "FixedEventHeader".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FixedEventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FixedEventHeader(){}
	public org.omg.CosNotification.EventType event_type;
	public java.lang.String event_name = "";
	public FixedEventHeader(org.omg.CosNotification.EventType event_type, java.lang.String event_name)
	{
		this.event_type = event_type;
		this.event_name = event_name;
	}
}
