package org.omg.dds;

/**
 * Generated from IDL struct "OwnershipQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OwnershipQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public OwnershipQosPolicy(){}
	public org.omg.dds.OwnershipQosPolicyKind kind;
	public OwnershipQosPolicy(org.omg.dds.OwnershipQosPolicyKind kind)
	{
		this.kind = kind;
	}
}
