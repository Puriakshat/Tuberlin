package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL interface "ServerInformationIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerInformationIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServerInformationIterator value;
	public ServerInformationIteratorHolder()
	{
	}
	public ServerInformationIteratorHolder (final ServerInformationIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServerInformationIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerInformationIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServerInformationIteratorHelper.write (_out,value);
	}
}
