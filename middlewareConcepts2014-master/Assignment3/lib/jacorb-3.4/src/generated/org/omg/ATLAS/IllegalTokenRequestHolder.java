package org.omg.ATLAS;

/**
 * Generated from IDL exception "IllegalTokenRequest".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IllegalTokenRequestHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.ATLAS.IllegalTokenRequest value;

	public IllegalTokenRequestHolder ()
	{
	}
	public IllegalTokenRequestHolder(final org.omg.ATLAS.IllegalTokenRequest initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.ATLAS.IllegalTokenRequestHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.ATLAS.IllegalTokenRequestHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.ATLAS.IllegalTokenRequestHelper.write(_out, value);
	}
}
