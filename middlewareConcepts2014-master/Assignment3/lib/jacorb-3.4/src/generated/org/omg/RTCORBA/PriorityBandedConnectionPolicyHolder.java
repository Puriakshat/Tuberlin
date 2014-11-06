package org.omg.RTCORBA;

/**
 * Generated from IDL interface "PriorityBandedConnectionPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PriorityBandedConnectionPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public PriorityBandedConnectionPolicy value;
	public PriorityBandedConnectionPolicyHolder()
	{
	}
	public PriorityBandedConnectionPolicyHolder (final PriorityBandedConnectionPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PriorityBandedConnectionPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PriorityBandedConnectionPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PriorityBandedConnectionPolicyHelper.write (_out,value);
	}
}
