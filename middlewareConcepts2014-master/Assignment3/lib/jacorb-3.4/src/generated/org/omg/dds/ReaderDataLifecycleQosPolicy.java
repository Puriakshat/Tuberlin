package org.omg.dds;

/**
 * Generated from IDL struct "ReaderDataLifecycleQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ReaderDataLifecycleQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ReaderDataLifecycleQosPolicy(){}
	public org.omg.dds.Duration_t autopurge_nowriter_samples_delay;
	public ReaderDataLifecycleQosPolicy(org.omg.dds.Duration_t autopurge_nowriter_samples_delay)
	{
		this.autopurge_nowriter_samples_delay = autopurge_nowriter_samples_delay;
	}
}
