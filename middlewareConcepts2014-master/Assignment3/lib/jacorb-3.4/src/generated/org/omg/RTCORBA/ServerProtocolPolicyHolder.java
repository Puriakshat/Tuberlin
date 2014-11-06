package org.omg.RTCORBA;

/**
 * Generated from IDL interface "ServerProtocolPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerProtocolPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServerProtocolPolicy value;
	public ServerProtocolPolicyHolder()
	{
	}
	public ServerProtocolPolicyHolder (final ServerProtocolPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServerProtocolPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerProtocolPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServerProtocolPolicyHelper.write (_out,value);
	}
}
