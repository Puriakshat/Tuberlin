package org.omg.RTCORBA;

/**
 * Generated from IDL alias "ThreadpoolLanes".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ThreadpoolLanesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.RTCORBA.ThreadpoolLane[] value;

	public ThreadpoolLanesHolder ()
	{
	}
	public ThreadpoolLanesHolder (final org.omg.RTCORBA.ThreadpoolLane[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ThreadpoolLanesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ThreadpoolLanesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ThreadpoolLanesHelper.write (out,value);
	}
}
