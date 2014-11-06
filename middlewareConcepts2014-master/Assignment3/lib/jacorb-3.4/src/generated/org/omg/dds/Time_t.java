package org.omg.dds;

/**
 * Generated from IDL struct "Time_t".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Time_t
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Time_t(){}
	public int sec;
	public int nanosec;
	public Time_t(int sec, int nanosec)
	{
		this.sec = sec;
		this.nanosec = nanosec;
	}
}
