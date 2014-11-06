package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "FilterIDSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FilterIDSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public FilterIDSeqHolder ()
	{
	}
	public FilterIDSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FilterIDSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterIDSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FilterIDSeqHelper.write (out,value);
	}
}
