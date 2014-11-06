package org.jacorb.util.tracing;

/**
 * Generated from IDL interface "TracingService".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:53
 */

public final class TracingServiceHolder	implements org.omg.CORBA.portable.Streamable{
	 public TracingService value;
	public TracingServiceHolder()
	{
	}
	public TracingServiceHolder (final TracingService initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TracingServiceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TracingServiceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TracingServiceHelper.write (_out,value);
	}
}
