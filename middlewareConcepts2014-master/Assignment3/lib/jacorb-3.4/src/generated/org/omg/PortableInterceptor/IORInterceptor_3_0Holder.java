package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "IORInterceptor_3_0".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IORInterceptor_3_0Holder	implements org.omg.CORBA.portable.Streamable{
	 public IORInterceptor_3_0 value;
	public IORInterceptor_3_0Holder()
	{
	}
	public IORInterceptor_3_0Holder (final IORInterceptor_3_0 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IORInterceptor_3_0Helper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IORInterceptor_3_0Helper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IORInterceptor_3_0Helper.write (_out,value);
	}
}
