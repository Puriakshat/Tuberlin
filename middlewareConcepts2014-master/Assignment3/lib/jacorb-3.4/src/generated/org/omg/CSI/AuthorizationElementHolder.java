package org.omg.CSI;

/**
 * Generated from IDL struct "AuthorizationElement".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AuthorizationElementHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSI.AuthorizationElement value;

	public AuthorizationElementHolder ()
	{
	}
	public AuthorizationElementHolder(final org.omg.CSI.AuthorizationElement initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CSI.AuthorizationElementHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CSI.AuthorizationElementHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CSI.AuthorizationElementHelper.write(_out, value);
	}
}
