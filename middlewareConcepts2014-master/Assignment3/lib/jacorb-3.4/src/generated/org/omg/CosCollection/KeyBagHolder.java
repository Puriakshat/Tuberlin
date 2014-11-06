package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeyBag".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class KeyBagHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeyBag value;
	public KeyBagHolder()
	{
	}
	public KeyBagHolder (final KeyBag initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeyBagHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeyBagHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeyBagHelper.write (_out,value);
	}
}
