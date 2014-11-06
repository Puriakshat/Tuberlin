package org.omg.CORBA;

/**
 * Generated from IDL interface "IRObject".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IRObjectHolder	implements org.omg.CORBA.portable.Streamable{
	 public IRObject value;
	public IRObjectHolder()
	{
	}
	public IRObjectHolder (final IRObject initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IRObjectHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IRObjectHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IRObjectHelper.write (_out,value);
	}
}
