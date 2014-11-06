package org.jacorb.imr;

/**
 * Generated from IDL interface "Registration".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RegistrationHolder	implements org.omg.CORBA.portable.Streamable{
	 public Registration value;
	public RegistrationHolder()
	{
	}
	public RegistrationHolder (final Registration initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RegistrationHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RegistrationHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RegistrationHelper.write (_out,value);
	}
}
