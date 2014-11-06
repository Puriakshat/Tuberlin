package org.omg.CORBA;

/**
 * Generated from IDL alias "ServiceOptionSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceOptionSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ServiceOptionSeqHolder ()
	{
	}
	public ServiceOptionSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceOptionSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceOptionSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceOptionSeqHelper.write (out,value);
	}
}
