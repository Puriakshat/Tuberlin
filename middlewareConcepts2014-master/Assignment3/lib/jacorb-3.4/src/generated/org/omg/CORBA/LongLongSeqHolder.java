package org.omg.CORBA;

/**
 * Generated from IDL alias "LongLongSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LongLongSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public long[] value;

	public LongLongSeqHolder ()
	{
	}
	public LongLongSeqHolder (final long[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LongLongSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LongLongSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LongLongSeqHelper.write (out,value);
	}
}
