package org.omg.RTCORBA;

/**
 * Generated from IDL interface "PrivateConnectionPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PrivateConnectionPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public PrivateConnectionPolicy value;
	public PrivateConnectionPolicyHolder()
	{
	}
	public PrivateConnectionPolicyHolder (final PrivateConnectionPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PrivateConnectionPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PrivateConnectionPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PrivateConnectionPolicyHelper.write (_out,value);
	}
}
