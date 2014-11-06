package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "ReceivedCredentials".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ReceivedCredentialsHolder	implements org.omg.CORBA.portable.Streamable{
	 public ReceivedCredentials value;
	public ReceivedCredentialsHolder()
	{
	}
	public ReceivedCredentialsHolder (final ReceivedCredentials initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ReceivedCredentialsHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReceivedCredentialsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ReceivedCredentialsHelper.write (_out,value);
	}
}
