package org.omg.dds;

/**
 * Generated from IDL struct "DurabilityQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DurabilityQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DurabilityQosPolicy(){}
	public org.omg.dds.DurabilityQosPolicyKind kind;
	public org.omg.dds.Duration_t service_cleanup_delay;
	public DurabilityQosPolicy(org.omg.dds.DurabilityQosPolicyKind kind, org.omg.dds.Duration_t service_cleanup_delay)
	{
		this.kind = kind;
		this.service_cleanup_delay = service_cleanup_delay;
	}
}
