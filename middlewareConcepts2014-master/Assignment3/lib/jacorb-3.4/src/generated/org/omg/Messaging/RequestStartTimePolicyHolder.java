package org.omg.Messaging;

/**
 * Generated from IDL interface "RequestStartTimePolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RequestStartTimePolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequestStartTimePolicy value;
	public RequestStartTimePolicyHolder()
	{
	}
	public RequestStartTimePolicyHolder (final RequestStartTimePolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequestStartTimePolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestStartTimePolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequestStartTimePolicyHelper.write (_out,value);
	}
}
