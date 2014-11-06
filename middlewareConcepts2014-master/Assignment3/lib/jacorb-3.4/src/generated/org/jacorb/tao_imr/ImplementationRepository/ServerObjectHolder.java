package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL interface "ServerObject".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerObjectHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServerObject value;
	public ServerObjectHolder()
	{
	}
	public ServerObjectHolder (final ServerObject initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServerObjectHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerObjectHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServerObjectHelper.write (_out,value);
	}
}
