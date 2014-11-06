package org.omg.GIOP;
/**
 * Generated from IDL enum "LocateStatusType_1_0".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LocateStatusType_1_0Holder
	implements org.omg.CORBA.portable.Streamable
{
	public LocateStatusType_1_0 value;

	public LocateStatusType_1_0Holder ()
	{
	}
	public LocateStatusType_1_0Holder (final LocateStatusType_1_0 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LocateStatusType_1_0Helper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LocateStatusType_1_0Helper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LocateStatusType_1_0Helper.write (out,value);
	}
}
