package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ServerRequestInterceptor".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerRequestInterceptorHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServerRequestInterceptor value;
	public ServerRequestInterceptorHolder()
	{
	}
	public ServerRequestInterceptorHolder (final ServerRequestInterceptor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServerRequestInterceptorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerRequestInterceptorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServerRequestInterceptorHelper.write (_out,value);
	}
}
