package org.omg.CosCollection;

/**
 * Generated from IDL struct "NVPair".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NVPair
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NVPair(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any value;
	public NVPair(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
}
