package org.omg.Messaging;

/**
 * Generated from IDL struct "PolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Messaging.PolicyValue value;

	public PolicyValueHolder ()
	{
	}
	public PolicyValueHolder(final org.omg.Messaging.PolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Messaging.PolicyValueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Messaging.PolicyValueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Messaging.PolicyValueHelper.write(_out, value);
	}
}
