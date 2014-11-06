package org.jacorb.imr;

/**
 * Generated from IDL alias "HostInfoSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HostInfoSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.imr.HostInfo[] value;

	public HostInfoSeqHolder ()
	{
	}
	public HostInfoSeqHolder (final org.jacorb.imr.HostInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HostInfoSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HostInfoSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HostInfoSeqHelper.write (out,value);
	}
}
