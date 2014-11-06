package org.omg.CosCollection;

/**
 * Generated from IDL exception "KeyInvalid".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class KeyInvalidHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.KeyInvalid value;

	public KeyInvalidHolder ()
	{
	}
	public KeyInvalidHolder(final org.omg.CosCollection.KeyInvalid initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosCollection.KeyInvalidHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosCollection.KeyInvalidHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosCollection.KeyInvalidHelper.write(_out, value);
	}
}
