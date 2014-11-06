package org.omg.CosTypedNotifyComm;

/**
 * Generated from IDL interface "TypedPushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TypedPushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypedPushConsumer value;
	public TypedPushConsumerHolder()
	{
	}
	public TypedPushConsumerHolder (final TypedPushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TypedPushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypedPushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypedPushConsumerHelper.write (_out,value);
	}
}
