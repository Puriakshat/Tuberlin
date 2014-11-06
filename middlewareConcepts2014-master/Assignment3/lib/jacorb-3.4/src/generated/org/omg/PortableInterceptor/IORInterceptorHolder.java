package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "IORInterceptor".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IORInterceptorHolder	implements org.omg.CORBA.portable.Streamable{
	 public IORInterceptor value;
	public IORInterceptorHolder()
	{
	}
	public IORInterceptorHolder (final IORInterceptor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IORInterceptorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IORInterceptorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IORInterceptorHelper.write (_out,value);
	}
}
