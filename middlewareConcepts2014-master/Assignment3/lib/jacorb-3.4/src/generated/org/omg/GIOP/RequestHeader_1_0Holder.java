package org.omg.GIOP;

/**
 * Generated from IDL struct "RequestHeader_1_0".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RequestHeader_1_0Holder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.GIOP.RequestHeader_1_0 value;

	public RequestHeader_1_0Holder ()
	{
	}
	public RequestHeader_1_0Holder(final org.omg.GIOP.RequestHeader_1_0 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.GIOP.RequestHeader_1_0Helper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.GIOP.RequestHeader_1_0Helper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.GIOP.RequestHeader_1_0Helper.write(_out, value);
	}
}
