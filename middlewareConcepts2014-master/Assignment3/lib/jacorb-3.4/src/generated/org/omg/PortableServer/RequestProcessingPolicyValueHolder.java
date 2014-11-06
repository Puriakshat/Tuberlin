package org.omg.PortableServer;
/**
 * Generated from IDL enum "RequestProcessingPolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RequestProcessingPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public RequestProcessingPolicyValue value;

	public RequestProcessingPolicyValueHolder ()
	{
	}
	public RequestProcessingPolicyValueHolder (final RequestProcessingPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RequestProcessingPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestProcessingPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RequestProcessingPolicyValueHelper.write (out,value);
	}
}
