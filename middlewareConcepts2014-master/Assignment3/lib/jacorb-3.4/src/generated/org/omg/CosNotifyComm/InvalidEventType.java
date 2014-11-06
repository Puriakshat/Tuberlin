package org.omg.CosNotifyComm;

/**
 * Generated from IDL exception "InvalidEventType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidEventType
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public InvalidEventType()
	{
		super(org.omg.CosNotifyComm.InvalidEventTypeHelper.id());
	}

	public org.omg.CosNotification.EventType type;
	public InvalidEventType(java.lang.String _reason,org.omg.CosNotification.EventType type)
	{
		super(_reason);
		this.type = type;
	}
	public InvalidEventType(org.omg.CosNotification.EventType type)
	{
		super(org.omg.CosNotifyComm.InvalidEventTypeHelper.id());
		this.type = type;
	}
}
