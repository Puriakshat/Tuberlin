package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySortedIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class KeySortedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySortedIterator value;
	public KeySortedIteratorHolder()
	{
	}
	public KeySortedIteratorHolder (final KeySortedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySortedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySortedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySortedIteratorHelper.write (_out,value);
	}
}
