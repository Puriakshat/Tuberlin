package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ORBInitializer".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ORBInitializerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ORBInitializer value;
	public ORBInitializerHolder()
	{
	}
	public ORBInitializerHolder (final ORBInitializer initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ORBInitializerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ORBInitializerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ORBInitializerHelper.write (_out,value);
	}
}
