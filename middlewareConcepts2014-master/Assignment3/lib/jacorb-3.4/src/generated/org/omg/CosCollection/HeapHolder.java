package org.omg.CosCollection;

/**
 * Generated from IDL interface "Heap".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HeapHolder	implements org.omg.CORBA.portable.Streamable{
	 public Heap value;
	public HeapHolder()
	{
	}
	public HeapHolder (final Heap initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HeapHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HeapHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HeapHelper.write (_out,value);
	}
}
