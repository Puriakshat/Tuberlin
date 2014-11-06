package org.omg.RTCORBA;

/**
 * Generated from IDL struct "PriorityBand".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PriorityBand
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PriorityBand(){}
	public short low;
	public short high;
	public PriorityBand(short low, short high)
	{
		this.low = low;
		this.high = high;
	}
}
