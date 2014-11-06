package org.omg.GIOP;

/**
 * Generated from IDL alias "Magicn".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MagicnHolder
	implements org.omg.CORBA.portable.Streamable
{
	public char[] value;

	public MagicnHolder ()
	{
	}
	public MagicnHolder (final char[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MagicnHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MagicnHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MagicnHelper.write (out,value);
	}
}
