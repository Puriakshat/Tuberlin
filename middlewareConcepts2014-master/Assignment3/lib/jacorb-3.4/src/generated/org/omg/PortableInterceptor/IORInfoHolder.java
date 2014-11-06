package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "IORInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IORInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public IORInfo value;
	public IORInfoHolder()
	{
	}
	public IORInfoHolder (final IORInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IORInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IORInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IORInfoHelper.write (_out,value);
	}
}
