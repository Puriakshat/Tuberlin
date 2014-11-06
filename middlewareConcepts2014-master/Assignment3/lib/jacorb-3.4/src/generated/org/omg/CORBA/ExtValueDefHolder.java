package org.omg.CORBA;

/**
 * Generated from IDL interface "ExtValueDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtValueDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtValueDef value;
	public ExtValueDefHolder()
	{
	}
	public ExtValueDefHolder (final ExtValueDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExtValueDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtValueDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtValueDefHelper.write (_out,value);
	}
}
