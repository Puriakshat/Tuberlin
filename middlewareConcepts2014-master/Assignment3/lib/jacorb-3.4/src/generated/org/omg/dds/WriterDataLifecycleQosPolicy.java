package org.omg.dds;

/**
 * Generated from IDL struct "WriterDataLifecycleQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class WriterDataLifecycleQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public WriterDataLifecycleQosPolicy(){}
	public boolean autodispose_unregistered_instances;
	public WriterDataLifecycleQosPolicy(boolean autodispose_unregistered_instances)
	{
		this.autodispose_unregistered_instances = autodispose_unregistered_instances;
	}
}
