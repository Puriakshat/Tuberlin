package org.omg.DynamicAny;

/**
 * Generated from IDL alias "AnySeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AnySeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.Any[] value;

	public AnySeqHolder ()
	{
	}
	public AnySeqHolder (final org.omg.CORBA.Any[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AnySeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AnySeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AnySeqHelper.write (out,value);
	}
}
