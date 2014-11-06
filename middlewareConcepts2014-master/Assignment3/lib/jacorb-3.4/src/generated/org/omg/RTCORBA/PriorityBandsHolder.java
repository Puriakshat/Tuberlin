package org.omg.RTCORBA;

/**
 * Generated from IDL alias "PriorityBands".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PriorityBandsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.RTCORBA.PriorityBand[] value;

	public PriorityBandsHolder ()
	{
	}
	public PriorityBandsHolder (final org.omg.RTCORBA.PriorityBand[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PriorityBandsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PriorityBandsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PriorityBandsHelper.write (out,value);
	}
}
