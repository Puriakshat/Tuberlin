package org.omg.CORBA;

/**
 * Generated from IDL alias "FloatSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FloatSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public float[] value;

	public FloatSeqHolder ()
	{
	}
	public FloatSeqHolder (final float[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FloatSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FloatSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FloatSeqHelper.write (out,value);
	}
}
