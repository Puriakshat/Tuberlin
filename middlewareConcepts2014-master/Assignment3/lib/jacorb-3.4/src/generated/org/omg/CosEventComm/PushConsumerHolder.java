package org.omg.CosEventComm;

/**
 * Generated from IDL interface "PushConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PushConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public PushConsumer value;
	public PushConsumerHolder()
	{
	}
	public PushConsumerHolder (final PushConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PushConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PushConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PushConsumerHelper.write (_out,value);
	}
}
