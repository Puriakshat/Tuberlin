package org.omg.GIOP;

/**
 * Generated from IDL struct "LocateReplyHeader_1_2".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LocateReplyHeader_1_2Holder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GIOP.LocateReplyHeader_1_2 value;

	public LocateReplyHeader_1_2Holder ()
	{
	}
	public LocateReplyHeader_1_2Holder(final org.omg.GIOP.LocateReplyHeader_1_2 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GIOP.LocateReplyHeader_1_2Helper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GIOP.LocateReplyHeader_1_2Helper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GIOP.LocateReplyHeader_1_2Helper.write(_out, value);
	}
}
