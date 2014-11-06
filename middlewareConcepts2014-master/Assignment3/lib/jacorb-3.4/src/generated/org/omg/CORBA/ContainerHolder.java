package org.omg.CORBA;

/**
 * Generated from IDL interface "Container".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ContainerHolder	implements org.omg.CORBA.portable.Streamable{
	 public Container value;
	public ContainerHolder()
	{
	}
	public ContainerHolder (final Container initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ContainerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ContainerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ContainerHelper.write (_out,value);
	}
}
