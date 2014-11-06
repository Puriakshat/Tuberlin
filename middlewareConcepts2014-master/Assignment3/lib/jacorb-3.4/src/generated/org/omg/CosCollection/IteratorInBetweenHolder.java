package org.omg.CosCollection;

/**
 * Generated from IDL exception "IteratorInBetween".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IteratorInBetweenHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.IteratorInBetween value;

	public IteratorInBetweenHolder ()
	{
	}
	public IteratorInBetweenHolder(final org.omg.CosCollection.IteratorInBetween initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosCollection.IteratorInBetweenHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosCollection.IteratorInBetweenHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosCollection.IteratorInBetweenHelper.write(_out, value);
	}
}
