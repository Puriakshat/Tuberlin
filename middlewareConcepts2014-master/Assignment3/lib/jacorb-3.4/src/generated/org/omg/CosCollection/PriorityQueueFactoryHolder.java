package org.omg.CosCollection;

/**
 * Generated from IDL interface "PriorityQueueFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PriorityQueueFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public PriorityQueueFactory value;
	public PriorityQueueFactoryHolder()
	{
	}
	public PriorityQueueFactoryHolder (final PriorityQueueFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PriorityQueueFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PriorityQueueFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PriorityQueueFactoryHelper.write (_out,value);
	}
}
