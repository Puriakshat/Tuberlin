package org.omg.IIOP;

/**
 * Generated from IDL alias "ListenPointList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ListenPointListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IIOP.ListenPoint[] value;

	public ListenPointListHolder ()
	{
	}
	public ListenPointListHolder (final org.omg.IIOP.ListenPoint[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ListenPointListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ListenPointListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ListenPointListHelper.write (out,value);
	}
}
