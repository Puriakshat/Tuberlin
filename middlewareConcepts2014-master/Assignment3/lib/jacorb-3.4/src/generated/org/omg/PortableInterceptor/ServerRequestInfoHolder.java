package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ServerRequestInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerRequestInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServerRequestInfo value;
	public ServerRequestInfoHolder()
	{
	}
	public ServerRequestInfoHolder (final ServerRequestInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServerRequestInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerRequestInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServerRequestInfoHelper.write (_out,value);
	}
}
