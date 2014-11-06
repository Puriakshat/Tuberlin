package org.omg.PortableServer;
/**
 * Generated from IDL enum "ThreadPolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ThreadPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ThreadPolicyValue value;

	public ThreadPolicyValueHolder ()
	{
	}
	public ThreadPolicyValueHolder (final ThreadPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ThreadPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ThreadPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ThreadPolicyValueHelper.write (out,value);
	}
}
