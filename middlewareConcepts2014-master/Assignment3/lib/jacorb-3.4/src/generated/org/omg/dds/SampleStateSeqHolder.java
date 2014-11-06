package org.omg.dds;

/**
 * Generated from IDL alias "SampleStateSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SampleStateSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public SampleStateSeqHolder ()
	{
	}
	public SampleStateSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SampleStateSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SampleStateSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SampleStateSeqHelper.write (out,value);
	}
}
