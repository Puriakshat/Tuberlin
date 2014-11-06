package org.omg.Messaging;

/**
 * Generated from IDL interface "QueueOrderPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class QueueOrderPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public QueueOrderPolicy value;
	public QueueOrderPolicyHolder()
	{
	}
	public QueueOrderPolicyHolder (final QueueOrderPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QueueOrderPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QueueOrderPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QueueOrderPolicyHelper.write (_out,value);
	}
}
