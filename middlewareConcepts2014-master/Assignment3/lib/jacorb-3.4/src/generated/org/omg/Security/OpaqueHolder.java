package org.omg.Security;

/**
 * Generated from IDL alias "Opaque".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OpaqueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public OpaqueHolder ()
	{
	}
	public OpaqueHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OpaqueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OpaqueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OpaqueHelper.write (out,value);
	}
}
