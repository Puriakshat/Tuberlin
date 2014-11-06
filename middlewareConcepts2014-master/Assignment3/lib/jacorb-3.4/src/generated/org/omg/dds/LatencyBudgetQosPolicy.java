package org.omg.dds;

/**
 * Generated from IDL struct "LatencyBudgetQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LatencyBudgetQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public LatencyBudgetQosPolicy(){}
	public org.omg.dds.Duration_t duration;
	public LatencyBudgetQosPolicy(org.omg.dds.Duration_t duration)
	{
		this.duration = duration;
	}
}
