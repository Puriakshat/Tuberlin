package org.omg.CosNotification;

/**
 * Generated from IDL alias "EventBatch".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EventBatchHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.StructuredEvent[] value;

	public EventBatchHolder ()
	{
	}
	public EventBatchHolder (final org.omg.CosNotification.StructuredEvent[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EventBatchHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EventBatchHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EventBatchHelper.write (out,value);
	}
}
