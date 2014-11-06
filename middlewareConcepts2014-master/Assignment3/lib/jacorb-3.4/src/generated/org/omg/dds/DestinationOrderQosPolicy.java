package org.omg.dds;

/**
 * Generated from IDL struct "DestinationOrderQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DestinationOrderQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DestinationOrderQosPolicy(){}
	public org.omg.dds.DestinationOrderQosPolicyKind kind;
	public DestinationOrderQosPolicy(org.omg.dds.DestinationOrderQosPolicyKind kind)
	{
		this.kind = kind;
	}
}
