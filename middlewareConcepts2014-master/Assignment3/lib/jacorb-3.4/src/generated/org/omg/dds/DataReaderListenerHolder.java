package org.omg.dds;

/**
 * Generated from IDL interface "DataReaderListener".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DataReaderListenerHolder	implements org.omg.CORBA.portable.Streamable{
	 public DataReaderListener value;
	public DataReaderListenerHolder()
	{
	}
	public DataReaderListenerHolder (final DataReaderListener initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DataReaderListenerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DataReaderListenerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DataReaderListenerHelper.write (_out,value);
	}
}
