package org.omg.dds;

/**
 * Generated from IDL struct "LifespanQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LifespanQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.LifespanQosPolicy value;

	public LifespanQosPolicyHolder ()
	{
	}
	public LifespanQosPolicyHolder(final org.omg.dds.LifespanQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.LifespanQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.LifespanQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.LifespanQosPolicyHelper.write(_out, value);
	}
}
