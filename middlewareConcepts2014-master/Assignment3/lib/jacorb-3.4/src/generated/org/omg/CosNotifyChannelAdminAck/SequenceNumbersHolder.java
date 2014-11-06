package org.omg.CosNotifyChannelAdminAck;

/**
 * Generated from IDL alias "SequenceNumbers".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SequenceNumbersHolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public SequenceNumbersHolder ()
	{
	}
	public SequenceNumbersHolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SequenceNumbersHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceNumbersHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SequenceNumbersHelper.write (out,value);
	}
}
