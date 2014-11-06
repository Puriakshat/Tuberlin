package org.omg.CORBA;

/**
 * Generated from IDL interface "ExtAbstractInterfaceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtAbstractInterfaceDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtAbstractInterfaceDef value;
	public ExtAbstractInterfaceDefHolder()
	{
	}
	public ExtAbstractInterfaceDefHolder (final ExtAbstractInterfaceDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ExtAbstractInterfaceDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtAbstractInterfaceDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtAbstractInterfaceDefHelper.write (_out,value);
	}
}
