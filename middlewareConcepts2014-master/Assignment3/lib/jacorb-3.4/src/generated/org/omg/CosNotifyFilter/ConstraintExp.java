package org.omg.CosNotifyFilter;

/**
 * Generated from IDL struct "ConstraintExp".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConstraintExp
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ConstraintExp(){}
	public org.omg.CosNotification.EventType[] event_types;
	public java.lang.String constraint_expr = "";
	public ConstraintExp(org.omg.CosNotification.EventType[] event_types, java.lang.String constraint_expr)
	{
		this.event_types = event_types;
		this.constraint_expr = constraint_expr;
	}
}
