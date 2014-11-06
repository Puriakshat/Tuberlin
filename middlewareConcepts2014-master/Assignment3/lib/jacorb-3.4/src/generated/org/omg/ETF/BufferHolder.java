package org.omg.ETF;

/**
 * Generated from IDL alias "Buffer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BufferHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public BufferHolder ()
	{
	}
	public BufferHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BufferHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BufferHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BufferHelper.write (out,value);
	}
}
