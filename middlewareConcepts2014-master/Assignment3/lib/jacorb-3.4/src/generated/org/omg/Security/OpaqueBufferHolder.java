package org.omg.Security;

/**
 * Generated from IDL struct "OpaqueBuffer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OpaqueBufferHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.OpaqueBuffer value;

	public OpaqueBufferHolder ()
	{
	}
	public OpaqueBufferHolder(final org.omg.Security.OpaqueBuffer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.OpaqueBufferHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.OpaqueBufferHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.OpaqueBufferHelper.write(_out, value);
	}
}
