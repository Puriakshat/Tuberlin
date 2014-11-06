package org.omg.CosTime;

/**
 * Generated from IDL interface "TimeService".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TimeServiceHolder	implements org.omg.CORBA.portable.Streamable{
	 public TimeService value;
	public TimeServiceHolder()
	{
	}
	public TimeServiceHolder (final TimeService initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TimeServiceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TimeServiceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TimeServiceHelper.write (_out,value);
	}
}
