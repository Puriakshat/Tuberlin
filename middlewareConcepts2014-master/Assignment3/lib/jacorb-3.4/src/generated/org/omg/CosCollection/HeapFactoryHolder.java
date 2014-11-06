package org.omg.CosCollection;

/**
 * Generated from IDL interface "HeapFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HeapFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public HeapFactory value;
	public HeapFactoryHolder()
	{
	}
	public HeapFactoryHolder (final HeapFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HeapFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HeapFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HeapFactoryHelper.write (_out,value);
	}
}
