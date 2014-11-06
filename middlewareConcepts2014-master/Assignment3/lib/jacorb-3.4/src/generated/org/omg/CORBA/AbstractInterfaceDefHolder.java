package org.omg.CORBA;

/**
 * Generated from IDL interface "AbstractInterfaceDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AbstractInterfaceDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public AbstractInterfaceDef value;
	public AbstractInterfaceDefHolder()
	{
	}
	public AbstractInterfaceDefHolder (final AbstractInterfaceDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AbstractInterfaceDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AbstractInterfaceDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AbstractInterfaceDefHelper.write (_out,value);
	}
}
