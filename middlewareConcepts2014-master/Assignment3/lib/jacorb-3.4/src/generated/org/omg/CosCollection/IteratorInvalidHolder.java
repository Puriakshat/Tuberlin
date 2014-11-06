package org.omg.CosCollection;

/**
 * Generated from IDL exception "IteratorInvalid".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IteratorInvalidHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.IteratorInvalid value;

	public IteratorInvalidHolder ()
	{
	}
	public IteratorInvalidHolder(final org.omg.CosCollection.IteratorInvalid initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosCollection.IteratorInvalidHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosCollection.IteratorInvalidHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosCollection.IteratorInvalidHelper.write(_out, value);
	}
}
