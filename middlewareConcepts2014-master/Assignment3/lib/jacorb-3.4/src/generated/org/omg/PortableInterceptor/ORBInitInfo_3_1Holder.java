package org.omg.PortableInterceptor;

/**
 * Generated from IDL interface "ORBInitInfo_3_1".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ORBInitInfo_3_1Holder	implements org.omg.CORBA.portable.Streamable{
	 public ORBInitInfo_3_1 value;
	public ORBInitInfo_3_1Holder()
	{
	}
	public ORBInitInfo_3_1Holder (final ORBInitInfo_3_1 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ORBInitInfo_3_1Helper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ORBInitInfo_3_1Helper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ORBInitInfo_3_1Helper.write (_out,value);
	}
}
