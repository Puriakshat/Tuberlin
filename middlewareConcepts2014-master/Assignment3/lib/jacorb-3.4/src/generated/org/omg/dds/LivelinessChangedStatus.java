package org.omg.dds;

/**
 * Generated from IDL struct "LivelinessChangedStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LivelinessChangedStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public LivelinessChangedStatus(){}
	public int active_count;
	public int inactive_count;
	public int active_count_change;
	public int inactive_count_change;
	public LivelinessChangedStatus(int active_count, int inactive_count, int active_count_change, int inactive_count_change)
	{
		this.active_count = active_count;
		this.inactive_count = inactive_count;
		this.active_count_change = active_count_change;
		this.inactive_count_change = inactive_count_change;
	}
}
