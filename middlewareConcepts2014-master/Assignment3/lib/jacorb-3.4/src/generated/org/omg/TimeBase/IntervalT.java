package org.omg.TimeBase;

/**
 * Generated from IDL struct "IntervalT".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IntervalT
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IntervalT(){}
	public long lower_bound;
	public long upper_bound;
	public IntervalT(long lower_bound, long upper_bound)
	{
		this.lower_bound = lower_bound;
		this.upper_bound = upper_bound;
	}
}
