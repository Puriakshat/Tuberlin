package org.omg.GIOP;
/**
 * Generated from IDL enum "LocateStatusType_1_2".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LocateStatusType_1_2Holder
	implements org.omg.CORBA.portable.Streamable
{
	public LocateStatusType_1_2 value;

	public LocateStatusType_1_2Holder ()
	{
	}
	public LocateStatusType_1_2Holder (final LocateStatusType_1_2 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LocateStatusType_1_2Helper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LocateStatusType_1_2Helper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LocateStatusType_1_2Helper.write (out,value);
	}
}
