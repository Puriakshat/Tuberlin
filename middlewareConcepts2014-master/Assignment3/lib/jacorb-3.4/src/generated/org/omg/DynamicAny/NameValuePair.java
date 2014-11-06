package org.omg.DynamicAny;

/**
 * Generated from IDL struct "NameValuePair".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NameValuePair
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NameValuePair(){}
	public java.lang.String id = "";
	public org.omg.CORBA.Any value;
	public NameValuePair(java.lang.String id, org.omg.CORBA.Any value)
	{
		this.id = id;
		this.value = value;
	}
}
