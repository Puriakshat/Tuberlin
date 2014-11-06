package org.omg.dds;

/**
 * Generated from IDL struct "OfferedDeadlineMissedStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OfferedDeadlineMissedStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public OfferedDeadlineMissedStatus(){}
	public int total_count;
	public int total_count_change;
	public int last_instance_handle;
	public OfferedDeadlineMissedStatus(int total_count, int total_count_change, int last_instance_handle)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_instance_handle = last_instance_handle;
	}
}
