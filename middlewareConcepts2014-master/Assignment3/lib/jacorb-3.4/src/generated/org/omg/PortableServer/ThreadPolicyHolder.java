package org.omg.PortableServer;

/**
 * Generated from IDL interface "ThreadPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ThreadPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ThreadPolicy value;
	public ThreadPolicyHolder()
	{
	}
	public ThreadPolicyHolder (final ThreadPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ThreadPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ThreadPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ThreadPolicyHelper.write (_out,value);
	}
}
