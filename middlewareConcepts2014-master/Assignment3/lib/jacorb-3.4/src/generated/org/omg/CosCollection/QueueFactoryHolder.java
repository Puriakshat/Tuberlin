package org.omg.CosCollection;

/**
 * Generated from IDL interface "QueueFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class QueueFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public QueueFactory value;
	public QueueFactoryHolder()
	{
	}
	public QueueFactoryHolder (final QueueFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QueueFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QueueFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QueueFactoryHelper.write (_out,value);
	}
}
