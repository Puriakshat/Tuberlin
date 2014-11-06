package org.omg.Security;
/**
 * Generated from IDL enum "AuthenticationStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AuthenticationStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public AuthenticationStatus value;

	public AuthenticationStatusHolder ()
	{
	}
	public AuthenticationStatusHolder (final AuthenticationStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AuthenticationStatusHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuthenticationStatusHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AuthenticationStatusHelper.write (out,value);
	}
}
