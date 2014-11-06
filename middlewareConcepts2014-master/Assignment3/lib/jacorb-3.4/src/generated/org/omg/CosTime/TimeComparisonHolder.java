package org.omg.CosTime;
/**
 * Generated from IDL enum "TimeComparison".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TimeComparisonHolder
	implements org.omg.CORBA.portable.Streamable
{
	public TimeComparison value;

	public TimeComparisonHolder ()
	{
	}
	public TimeComparisonHolder (final TimeComparison initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TimeComparisonHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TimeComparisonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TimeComparisonHelper.write (out,value);
	}
}
