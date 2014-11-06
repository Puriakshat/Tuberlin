package org.omg.SecurityReplaceable;

/**
 * Generated from IDL interface "SecurityContext".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SecurityContextHolder	implements org.omg.CORBA.portable.Streamable{
	 public SecurityContext value;
	public SecurityContextHolder()
	{
	}
	public SecurityContextHolder (final SecurityContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SecurityContextHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SecurityContextHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SecurityContextHelper.write (_out,value);
	}
}
