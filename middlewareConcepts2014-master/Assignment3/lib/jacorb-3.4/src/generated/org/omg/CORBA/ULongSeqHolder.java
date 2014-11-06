package org.omg.CORBA;

/**
 * Generated from IDL alias "ULongSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ULongSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public ULongSeqHolder ()
	{
	}
	public ULongSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ULongSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ULongSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ULongSeqHelper.write (out,value);
	}
}
