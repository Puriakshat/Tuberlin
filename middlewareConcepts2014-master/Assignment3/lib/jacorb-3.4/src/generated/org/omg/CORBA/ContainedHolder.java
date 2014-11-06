package org.omg.CORBA;

/**
 * Generated from IDL interface "Contained".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ContainedHolder	implements org.omg.CORBA.portable.Streamable{
	 public Contained value;
	public ContainedHolder()
	{
	}
	public ContainedHolder (final Contained initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ContainedHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ContainedHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ContainedHelper.write (_out,value);
	}
}
