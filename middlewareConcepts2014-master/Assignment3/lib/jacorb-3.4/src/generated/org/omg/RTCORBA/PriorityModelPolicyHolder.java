package org.omg.RTCORBA;

/**
 * Generated from IDL interface "PriorityModelPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PriorityModelPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public PriorityModelPolicy value;
	public PriorityModelPolicyHolder()
	{
	}
	public PriorityModelPolicyHolder (final PriorityModelPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PriorityModelPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PriorityModelPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PriorityModelPolicyHelper.write (_out,value);
	}
}
