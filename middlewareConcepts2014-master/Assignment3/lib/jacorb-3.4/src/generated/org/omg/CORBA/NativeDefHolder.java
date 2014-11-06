package org.omg.CORBA;

/**
 * Generated from IDL interface "NativeDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NativeDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public NativeDef value;
	public NativeDefHolder()
	{
	}
	public NativeDefHolder (final NativeDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NativeDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NativeDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NativeDefHelper.write (_out,value);
	}
}
