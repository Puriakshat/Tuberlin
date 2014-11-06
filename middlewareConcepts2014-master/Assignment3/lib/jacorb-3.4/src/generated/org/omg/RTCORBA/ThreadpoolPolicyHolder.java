package org.omg.RTCORBA;

/**
 * Generated from IDL interface "ThreadpoolPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ThreadpoolPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ThreadpoolPolicy value;
	public ThreadpoolPolicyHolder()
	{
	}
	public ThreadpoolPolicyHolder (final ThreadpoolPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ThreadpoolPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ThreadpoolPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ThreadpoolPolicyHelper.write (_out,value);
	}
}
