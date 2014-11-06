package org.omg.CosNotification;

/**
 * Generated from IDL struct "EventHeader".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EventHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EventHeader(){}
	public org.omg.CosNotification.FixedEventHeader fixed_header;
	public org.omg.CosNotification.Property[] variable_header;
	public EventHeader(org.omg.CosNotification.FixedEventHeader fixed_header, org.omg.CosNotification.Property[] variable_header)
	{
		this.fixed_header = fixed_header;
		this.variable_header = variable_header;
	}
}
