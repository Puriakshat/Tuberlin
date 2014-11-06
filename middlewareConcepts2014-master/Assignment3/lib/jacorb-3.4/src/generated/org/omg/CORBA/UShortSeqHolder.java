package org.omg.CORBA;

/**
 * Generated from IDL alias "UShortSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UShortSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public UShortSeqHolder ()
	{
	}
	public UShortSeqHolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return UShortSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = UShortSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		UShortSeqHelper.write (out,value);
	}
}
