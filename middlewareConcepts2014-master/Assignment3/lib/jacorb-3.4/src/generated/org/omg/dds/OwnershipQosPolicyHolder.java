package org.omg.dds;

/**
 * Generated from IDL struct "OwnershipQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OwnershipQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.OwnershipQosPolicy value;

	public OwnershipQosPolicyHolder ()
	{
	}
	public OwnershipQosPolicyHolder(final org.omg.dds.OwnershipQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.OwnershipQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.OwnershipQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.OwnershipQosPolicyHelper.write(_out, value);
	}
}
