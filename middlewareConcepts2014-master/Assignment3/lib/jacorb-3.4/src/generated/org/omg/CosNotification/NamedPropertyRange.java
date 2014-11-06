package org.omg.CosNotification;

/**
 * Generated from IDL struct "NamedPropertyRange".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NamedPropertyRange
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NamedPropertyRange(){}
	public java.lang.String name = "";
	public org.omg.CosNotification.PropertyRange range;
	public NamedPropertyRange(java.lang.String name, org.omg.CosNotification.PropertyRange range)
	{
		this.name = name;
		this.range = range;
	}
}
