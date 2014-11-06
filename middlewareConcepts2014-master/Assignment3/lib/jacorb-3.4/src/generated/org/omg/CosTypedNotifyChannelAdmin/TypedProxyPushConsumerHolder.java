package org.omg.CosTypedNotifyChannelAdmin;

/**
 * Generated from IDL interface "TypedProxyPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TypedProxyPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedProxyPushConsumer value;
	public TypedProxyPushConsumerHolder()
	{
	}
	public TypedProxyPushConsumerHolder (final TypedProxyPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedProxyPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedProxyPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedProxyPushConsumerHelper.write (_out,value);
	}
}
