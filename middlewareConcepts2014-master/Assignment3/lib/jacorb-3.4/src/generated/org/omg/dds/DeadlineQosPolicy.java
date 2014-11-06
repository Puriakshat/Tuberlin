package org.omg.dds;

/**
 * Generated from IDL struct "DeadlineQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DeadlineQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DeadlineQosPolicy(){}
	public org.omg.dds.Duration_t period;
	public DeadlineQosPolicy(org.omg.dds.Duration_t period)
	{
		this.period = period;
	}
}
