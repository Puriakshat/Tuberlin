package org.omg.dds;

/**
 * Generated from IDL struct "SampleLostStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SampleLostStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SampleLostStatus(){}
	public int total_count;
	public int total_count_change;
	public SampleLostStatus(int total_count, int total_count_change)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
	}
}
