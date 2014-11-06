package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySortedIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EqualitySortedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySortedIterator value;
	public EqualitySortedIteratorHolder()
	{
	}
	public EqualitySortedIteratorHolder (final EqualitySortedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySortedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySortedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySortedIteratorHelper.write (_out,value);
	}
}
