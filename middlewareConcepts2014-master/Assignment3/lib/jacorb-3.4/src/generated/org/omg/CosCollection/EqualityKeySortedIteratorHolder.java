package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityKeySortedIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EqualityKeySortedIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityKeySortedIterator value;
	public EqualityKeySortedIteratorHolder()
	{
	}
	public EqualityKeySortedIteratorHolder (final EqualityKeySortedIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityKeySortedIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityKeySortedIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityKeySortedIteratorHelper.write (_out,value);
	}
}
