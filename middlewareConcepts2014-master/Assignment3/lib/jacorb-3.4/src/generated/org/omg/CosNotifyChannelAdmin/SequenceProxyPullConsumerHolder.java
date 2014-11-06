package org.omg.CosNotifyChannelAdmin;

/**
 * Generated from IDL interface "SequenceProxyPullConsumer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SequenceProxyPullConsumerHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceProxyPullConsumer value;
	public SequenceProxyPullConsumerHolder()
	{
	}
	public SequenceProxyPullConsumerHolder (final SequenceProxyPullConsumer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceProxyPullConsumerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceProxyPullConsumerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceProxyPullConsumerHelper.write (_out,value);
	}
}
