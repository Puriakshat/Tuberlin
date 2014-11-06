package org.omg.dds;

/**
 * Generated from IDL alias "SampleInfoSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SampleInfoSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.SampleInfo[] value;

	public SampleInfoSeqHolder ()
	{
	}
	public SampleInfoSeqHolder (final org.omg.dds.SampleInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SampleInfoSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SampleInfoSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SampleInfoSeqHelper.write (out,value);
	}
}
