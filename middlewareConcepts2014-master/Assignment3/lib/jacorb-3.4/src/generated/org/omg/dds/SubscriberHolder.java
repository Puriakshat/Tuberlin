package org.omg.dds;

/**
 * Generated from IDL interface "Subscriber".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SubscriberHolder	implements org.omg.CORBA.portable.Streamable{
	 public Subscriber value;
	public SubscriberHolder()
	{
	}
	public SubscriberHolder (final Subscriber initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SubscriberHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubscriberHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SubscriberHelper.write (_out,value);
	}
}
