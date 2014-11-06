package org.omg.RTCORBA;

/**
 * Generated from IDL interface "Mutex".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MutexHolder	implements org.omg.CORBA.portable.Streamable{
	 public Mutex value;
	public MutexHolder()
	{
	}
	public MutexHolder (final Mutex initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MutexHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MutexHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MutexHelper.write (_out,value);
	}
}
