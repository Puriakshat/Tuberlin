package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "Credentials".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CredentialsHolder	implements org.omg.CORBA.portable.Streamable{
	 public Credentials value;
	public CredentialsHolder()
	{
	}
	public CredentialsHolder (final Credentials initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CredentialsHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CredentialsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CredentialsHelper.write (_out,value);
	}
}
