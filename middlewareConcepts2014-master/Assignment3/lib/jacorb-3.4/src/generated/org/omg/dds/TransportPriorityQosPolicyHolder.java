package org.omg.dds;

/**
 * Generated from IDL struct "TransportPriorityQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TransportPriorityQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.TransportPriorityQosPolicy value;

	public TransportPriorityQosPolicyHolder ()
	{
	}
	public TransportPriorityQosPolicyHolder(final org.omg.dds.TransportPriorityQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.TransportPriorityQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.TransportPriorityQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.TransportPriorityQosPolicyHelper.write(_out, value);
	}
}
