package org.omg.PortableInterceptor.ORBInitInfoPackage;

/**
 * Generated from IDL exception "InvalidName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName value;

	public InvalidNameHolder ()
	{
	}
	public InvalidNameHolder(final org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableInterceptor.ORBInitInfoPackage.InvalidNameHelper.write(_out, value);
	}
}
