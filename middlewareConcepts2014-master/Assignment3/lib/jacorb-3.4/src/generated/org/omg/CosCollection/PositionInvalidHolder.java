package org.omg.CosCollection;

/**
 * Generated from IDL exception "PositionInvalid".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PositionInvalidHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.PositionInvalid value;

	public PositionInvalidHolder ()
	{
	}
	public PositionInvalidHolder(final org.omg.CosCollection.PositionInvalid initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosCollection.PositionInvalidHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosCollection.PositionInvalidHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosCollection.PositionInvalidHelper.write(_out, value);
	}
}
