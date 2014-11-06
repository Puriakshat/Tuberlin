package org.omg.DynamicAny;

/**
 * Generated from IDL struct "NameDynAnyPair".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NameDynAnyPair
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public NameDynAnyPair(){}
	public java.lang.String id = "";
	public org.omg.DynamicAny.DynAny value;
	public NameDynAnyPair(java.lang.String id, org.omg.DynamicAny.DynAny value)
	{
		this.id = id;
		this.value = value;
	}
}
