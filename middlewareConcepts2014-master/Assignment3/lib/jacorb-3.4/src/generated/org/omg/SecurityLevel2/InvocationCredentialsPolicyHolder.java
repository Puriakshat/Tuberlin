package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "InvocationCredentialsPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvocationCredentialsPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public InvocationCredentialsPolicy value;
	public InvocationCredentialsPolicyHolder()
	{
	}
	public InvocationCredentialsPolicyHolder (final InvocationCredentialsPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return InvocationCredentialsPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InvocationCredentialsPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		InvocationCredentialsPolicyHelper.write (_out,value);
	}
}
