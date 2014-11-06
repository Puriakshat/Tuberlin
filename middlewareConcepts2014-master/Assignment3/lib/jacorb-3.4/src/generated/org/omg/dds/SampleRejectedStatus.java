package org.omg.dds;

/**
 * Generated from IDL struct "SampleRejectedStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SampleRejectedStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SampleRejectedStatus(){}
	public int total_count;
	public int total_count_change;
	public org.omg.dds.SampleRejectedStatusKind last_reason;
	public int last_instance_handle;
	public SampleRejectedStatus(int total_count, int total_count_change, org.omg.dds.SampleRejectedStatusKind last_reason, int last_instance_handle)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_reason = last_reason;
		this.last_instance_handle = last_instance_handle;
	}
}
