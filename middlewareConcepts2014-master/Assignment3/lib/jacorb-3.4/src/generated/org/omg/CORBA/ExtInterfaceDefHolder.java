package org.omg.CORBA;

/**
 * Generated from IDL interface "ExtInterfaceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtInterfaceDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtInterfaceDef value;
	public ExtInterfaceDefHolder()
	{
	}
	public ExtInterfaceDefHolder (final ExtInterfaceDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExtInterfaceDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtInterfaceDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtInterfaceDefHelper.write (_out,value);
	}
}
