package org.omg.ATLAS;

/**
 * Generated from IDL exception "TokenOkay".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TokenOkayHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.ATLAS.TokenOkay value;

	public TokenOkayHolder ()
	{
	}
	public TokenOkayHolder(final org.omg.ATLAS.TokenOkay initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.ATLAS.TokenOkayHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.ATLAS.TokenOkayHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.ATLAS.TokenOkayHelper.write(_out, value);
	}
}
