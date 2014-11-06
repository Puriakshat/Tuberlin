package org.omg.DynamicAny;

/**
 * Generated from IDL alias "DynAnySeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynAnySeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.DynAny[] value;

	public DynAnySeqHolder ()
	{
	}
	public DynAnySeqHolder (final org.omg.DynamicAny.DynAny[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DynAnySeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynAnySeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DynAnySeqHelper.write (out,value);
	}
}
