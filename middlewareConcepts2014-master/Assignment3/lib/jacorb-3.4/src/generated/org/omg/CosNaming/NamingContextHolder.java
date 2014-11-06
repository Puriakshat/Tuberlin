package org.omg.CosNaming;

/**
 * Generated from IDL interface "NamingContext".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NamingContextHolder	implements org.omg.CORBA.portable.Streamable{
	 public NamingContext value;
	public NamingContextHolder()
	{
	}
	public NamingContextHolder (final NamingContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NamingContextHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingContextHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NamingContextHelper.write (_out,value);
	}
}
