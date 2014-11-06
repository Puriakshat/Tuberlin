package org.omg.dds;

/**
 * Generated from IDL struct "LivelinessQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LivelinessQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.LivelinessQosPolicy value;

	public LivelinessQosPolicyHolder ()
	{
	}
	public LivelinessQosPolicyHolder(final org.omg.dds.LivelinessQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.LivelinessQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.LivelinessQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.LivelinessQosPolicyHelper.write(_out, value);
	}
}
