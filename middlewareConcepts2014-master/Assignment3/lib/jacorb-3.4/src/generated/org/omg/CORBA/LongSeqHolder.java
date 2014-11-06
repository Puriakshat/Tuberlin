package org.omg.CORBA;

/**
 * Generated from IDL alias "LongSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LongSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public LongSeqHolder ()
	{
	}
	public LongSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LongSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LongSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LongSeqHelper.write (out,value);
	}
}
