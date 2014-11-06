package org.omg.CosNotification;

/**
 * Generated from IDL struct "Property".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Property
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Property(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any value;
	public Property(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}
