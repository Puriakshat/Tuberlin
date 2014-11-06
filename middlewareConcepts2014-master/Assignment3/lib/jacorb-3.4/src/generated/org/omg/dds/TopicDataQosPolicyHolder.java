package org.omg.dds;

/**
 * Generated from IDL struct "TopicDataQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TopicDataQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.TopicDataQosPolicy value;

	public TopicDataQosPolicyHolder ()
	{
	}
	public TopicDataQosPolicyHolder(final org.omg.dds.TopicDataQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.TopicDataQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.TopicDataQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.TopicDataQosPolicyHelper.write(_out, value);
	}
}
