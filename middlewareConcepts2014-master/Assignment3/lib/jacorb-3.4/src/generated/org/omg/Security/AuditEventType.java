package org.omg.Security;

/**
 * Generated from IDL struct "AuditEventType".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AuditEventType
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AuditEventType(){}
	public org.omg.Security.ExtensibleFamily event_family;
	public short event_type;
	public AuditEventType(org.omg.Security.ExtensibleFamily event_family, short event_type)
	{
		this.event_family = event_family;
		this.event_type = event_type;
	}
}
