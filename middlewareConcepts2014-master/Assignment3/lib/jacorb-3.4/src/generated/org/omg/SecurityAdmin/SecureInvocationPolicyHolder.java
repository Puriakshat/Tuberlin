package org.omg.SecurityAdmin;

/**
 * Generated from IDL interface "SecureInvocationPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SecureInvocationPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public SecureInvocationPolicy value;
	public SecureInvocationPolicyHolder()
	{
	}
	public SecureInvocationPolicyHolder (final SecureInvocationPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SecureInvocationPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SecureInvocationPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SecureInvocationPolicyHelper.write (_out,value);
	}
}
