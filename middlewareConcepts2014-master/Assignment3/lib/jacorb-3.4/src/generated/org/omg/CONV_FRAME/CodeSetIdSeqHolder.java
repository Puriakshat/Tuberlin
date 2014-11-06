package org.omg.CONV_FRAME;

/**
 * Generated from IDL alias "CodeSetIdSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CodeSetIdSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public CodeSetIdSeqHolder ()
	{
	}
	public CodeSetIdSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CodeSetIdSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CodeSetIdSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CodeSetIdSeqHelper.write (out,value);
	}
}
