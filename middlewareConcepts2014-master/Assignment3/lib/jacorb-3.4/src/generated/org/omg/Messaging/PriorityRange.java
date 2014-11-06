package org.omg.Messaging;

/**
 * Generated from IDL struct "PriorityRange".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PriorityRange
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PriorityRange(){}
	public short min;
	public short max;
	public PriorityRange(short min, short max)
	{
		this.min = min;
		this.max = max;
	}
}
