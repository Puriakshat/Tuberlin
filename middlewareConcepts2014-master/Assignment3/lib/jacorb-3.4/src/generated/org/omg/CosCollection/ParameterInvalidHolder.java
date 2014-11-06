package org.omg.CosCollection;

/**
 * Generated from IDL exception "ParameterInvalid".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ParameterInvalidHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosCollection.ParameterInvalid value;

	public ParameterInvalidHolder ()
	{
	}
	public ParameterInvalidHolder(final org.omg.CosCollection.ParameterInvalid initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosCollection.ParameterInvalidHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosCollection.ParameterInvalidHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosCollection.ParameterInvalidHelper.write(_out, value);
	}
}
