package org.omg.dds;

/**
 * Generated from IDL interface "DataWriterListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DataWriterListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public DataWriterListener value;
	public DataWriterListenerHolder()
	{
	}
	public DataWriterListenerHolder (final DataWriterListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DataWriterListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DataWriterListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DataWriterListenerHelper.write (_out,value);
	}
}
