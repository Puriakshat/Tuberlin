package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityKeySortedCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EqualityKeySortedCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityKeySortedCollection value;
	public EqualityKeySortedCollectionHolder()
	{
	}
	public EqualityKeySortedCollectionHolder (final EqualityKeySortedCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityKeySortedCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityKeySortedCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityKeySortedCollectionHelper.write (_out,value);
	}
}
