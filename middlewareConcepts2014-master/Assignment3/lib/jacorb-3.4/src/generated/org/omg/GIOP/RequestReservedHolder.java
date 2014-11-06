package org.omg.GIOP;

/**
 * Generated from IDL alias "RequestReserved".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RequestReservedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public RequestReservedHolder ()
	{
	}
	public RequestReservedHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RequestReservedHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestReservedHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RequestReservedHelper.write (out,value);
	}
}
