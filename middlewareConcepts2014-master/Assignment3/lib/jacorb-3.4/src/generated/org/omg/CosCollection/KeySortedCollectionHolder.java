package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySortedCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class KeySortedCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySortedCollection value;
	public KeySortedCollectionHolder()
	{
	}
	public KeySortedCollectionHolder (final KeySortedCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySortedCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySortedCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySortedCollectionHelper.write (_out,value);
	}
}
