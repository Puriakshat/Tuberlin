package org.omg.dds;

/**
 * Generated from IDL struct "ResourceLimitsQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ResourceLimitsQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.ResourceLimitsQosPolicy value;

	public ResourceLimitsQosPolicyHolder ()
	{
	}
	public ResourceLimitsQosPolicyHolder(final org.omg.dds.ResourceLimitsQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.ResourceLimitsQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.ResourceLimitsQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.ResourceLimitsQosPolicyHelper.write(_out, value);
	}
}
