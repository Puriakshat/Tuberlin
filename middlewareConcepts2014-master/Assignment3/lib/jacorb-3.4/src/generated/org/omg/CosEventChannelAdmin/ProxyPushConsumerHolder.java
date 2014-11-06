package org.omg.CosEventChannelAdmin;

/**
 * Generated from IDL interface "ProxyPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyPushConsumer value;
	public ProxyPushConsumerHolder()
	{
	}
	public ProxyPushConsumerHolder (final ProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyPushConsumerHelper.write (_out,value);
	}
}
