package org.omg.CORBA;

/**
 * Generated from IDL alias "CharSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CharSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public char[] value;

	public CharSeqHolder ()
	{
	}
	public CharSeqHolder (final char[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CharSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CharSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CharSeqHelper.write (out,value);
	}
}
