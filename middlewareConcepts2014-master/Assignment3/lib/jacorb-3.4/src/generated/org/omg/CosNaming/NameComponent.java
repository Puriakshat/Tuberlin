package org.omg.CosNaming;

/**
 * Generated from IDL struct "NameComponent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NameComponent
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NameComponent(){}
	public java.lang.String id = "";
	public java.lang.String kind = "";
	public NameComponent(java.lang.String id, java.lang.String kind)
	{
		this.id = id;
		this.kind = kind;
	}
}
