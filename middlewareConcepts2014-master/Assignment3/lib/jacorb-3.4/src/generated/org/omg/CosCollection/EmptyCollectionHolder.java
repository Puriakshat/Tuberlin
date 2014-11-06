package org.omg.CosCollection;

/**
 * Generated from IDL exception "EmptyCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EmptyCollectionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.EmptyCollection value;

	public EmptyCollectionHolder ()
	{
	}
	public EmptyCollectionHolder(final org.omg.CosCollection.EmptyCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosCollection.EmptyCollectionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosCollection.EmptyCollectionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosCollection.EmptyCollectionHelper.write(_out, value);
	}
}
