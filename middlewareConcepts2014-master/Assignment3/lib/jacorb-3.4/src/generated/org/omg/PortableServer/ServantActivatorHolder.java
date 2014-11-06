package org.omg.PortableServer;

/**
 * Generated from IDL interface "ServantActivator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServantActivatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServantActivator value;
	public ServantActivatorHolder()
	{
	}
	public ServantActivatorHolder (final ServantActivator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServantActivatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServantActivatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServantActivatorHelper.write (_out,value);
	}
}
