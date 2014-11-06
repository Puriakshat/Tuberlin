package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySortedBagFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class KeySortedBagFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySortedBagFactory value;
	public KeySortedBagFactoryHolder()
	{
	}
	public KeySortedBagFactoryHolder (final KeySortedBagFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySortedBagFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySortedBagFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySortedBagFactoryHelper.write (_out,value);
	}
}
