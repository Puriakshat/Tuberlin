package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "RequestInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RequestInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequestInfo value;
	public RequestInfoHolder()
	{
	}
	public RequestInfoHolder (final RequestInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequestInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequestInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequestInfoHelper.write (_out,value);
	}
}
