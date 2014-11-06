package org.omg.dds;

/**
 * Generated from IDL struct "ReliabilityQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ReliabilityQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.ReliabilityQosPolicy value;

	public ReliabilityQosPolicyHolder ()
	{
	}
	public ReliabilityQosPolicyHolder(final org.omg.dds.ReliabilityQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.ReliabilityQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.ReliabilityQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.ReliabilityQosPolicyHelper.write(_out, value);
	}
}
