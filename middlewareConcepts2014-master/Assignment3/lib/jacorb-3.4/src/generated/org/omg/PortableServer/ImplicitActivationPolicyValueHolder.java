package org.omg.PortableServer;
/**
 * Generated from IDL enum "ImplicitActivationPolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ImplicitActivationPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ImplicitActivationPolicyValue value;

	public ImplicitActivationPolicyValueHolder ()
	{
	}
	public ImplicitActivationPolicyValueHolder (final ImplicitActivationPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ImplicitActivationPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ImplicitActivationPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ImplicitActivationPolicyValueHelper.write (out,value);
	}
}
