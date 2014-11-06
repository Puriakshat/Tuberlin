package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ORBInitInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ORBInitInfoHolder	implements org.omg.CORBA.portable.Streamable{
	 public ORBInitInfo value;
	public ORBInitInfoHolder()
	{
	}
	public ORBInitInfoHolder (final ORBInitInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ORBInitInfoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ORBInitInfoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ORBInitInfoHelper.write (_out,value);
	}
}
