package org.omg.dds;

/**
 * Generated from IDL interface "SubscriberListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SubscriberListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SubscriberListener value;
	public SubscriberListenerHolder()
	{
	}
	public SubscriberListenerHolder (final SubscriberListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SubscriberListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubscriberListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SubscriberListenerHelper.write (_out,value);
	}
}
