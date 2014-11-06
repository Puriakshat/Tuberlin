package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "ProxyConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ProxyConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProxyConsumer value;
	public ProxyConsumerHolder()
	{
	}
	public ProxyConsumerHolder (final ProxyConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProxyConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProxyConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProxyConsumerHelper.write (_out,value);
	}
}
