package org.omg.CORBA;

/**
 * Generated from IDL alias "ServiceDetailSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceDetailSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ServiceDetail[] value;

	public ServiceDetailSeqHolder ()
	{
	}
	public ServiceDetailSeqHolder (final org.omg.CORBA.ServiceDetail[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceDetailSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceDetailSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceDetailSeqHelper.write (out,value);
	}
}
