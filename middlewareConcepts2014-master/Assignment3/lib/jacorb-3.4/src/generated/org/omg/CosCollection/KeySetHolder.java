package org.omg.CosCollection;

/**
 * Generated from IDL interface "KeySet".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class KeySetHolder	implements org.omg.CORBA.portable.Streamable{
	 public KeySet value;
	public KeySetHolder()
	{
	}
	public KeySetHolder (final KeySet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return KeySetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = KeySetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		KeySetHelper.write (_out,value);
	}
}
