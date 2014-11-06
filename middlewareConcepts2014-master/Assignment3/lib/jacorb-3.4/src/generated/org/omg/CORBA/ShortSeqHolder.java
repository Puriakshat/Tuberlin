package org.omg.CORBA;

/**
 * Generated from IDL alias "ShortSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ShortSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public ShortSeqHolder ()
	{
	}
	public ShortSeqHolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ShortSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ShortSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ShortSeqHelper.write (out,value);
	}
}
