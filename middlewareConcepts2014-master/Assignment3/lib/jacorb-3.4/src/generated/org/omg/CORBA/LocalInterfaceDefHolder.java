package org.omg.CORBA;

/**
 * Generated from IDL interface "LocalInterfaceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LocalInterfaceDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public LocalInterfaceDef value;
	public LocalInterfaceDefHolder()
	{
	}
	public LocalInterfaceDefHolder (final LocalInterfaceDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LocalInterfaceDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LocalInterfaceDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LocalInterfaceDefHelper.write (_out,value);
	}
}
