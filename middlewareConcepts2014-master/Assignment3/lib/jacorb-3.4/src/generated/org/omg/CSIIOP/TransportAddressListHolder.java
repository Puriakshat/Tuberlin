package org.omg.CSIIOP;

/**
 * Generated from IDL alias "TransportAddressList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TransportAddressListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSIIOP.TransportAddress[] value;

	public TransportAddressListHolder ()
	{
	}
	public TransportAddressListHolder (final org.omg.CSIIOP.TransportAddress[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransportAddressListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransportAddressListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TransportAddressListHelper.write (out,value);
	}
}
