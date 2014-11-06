package org.omg.dds;

/**
 * Generated from IDL alias "InstanceHandleSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InstanceHandleSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public InstanceHandleSeqHolder ()
	{
	}
	public InstanceHandleSeqHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InstanceHandleSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InstanceHandleSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InstanceHandleSeqHelper.write (out,value);
	}
}
