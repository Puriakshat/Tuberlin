package org.jacorb.ssl;
/**
 * Generated from IDL enum "SSLPolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SSLPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SSLPolicyValue value;

	public SSLPolicyValueHolder ()
	{
	}
	public SSLPolicyValueHolder (final SSLPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SSLPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SSLPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SSLPolicyValueHelper.write (out,value);
	}
}
