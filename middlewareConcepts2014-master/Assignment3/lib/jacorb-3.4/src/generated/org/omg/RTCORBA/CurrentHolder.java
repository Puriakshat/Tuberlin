package org.omg.RTCORBA;

/**
 * Generated from IDL interface "Current".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CurrentHolder	implements org.omg.CORBA.portable.Streamable{
	 public Current value;
	public CurrentHolder()
	{
	}
	public CurrentHolder (final Current initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CurrentHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CurrentHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CurrentHelper.write (_out,value);
	}
}
