package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL alias "ServerInformationList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerInformationListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.tao_imr.ImplementationRepository.ServerInformation[] value;

	public ServerInformationListHolder ()
	{
	}
	public ServerInformationListHolder (final org.jacorb.tao_imr.ImplementationRepository.ServerInformation[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServerInformationListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerInformationListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServerInformationListHelper.write (out,value);
	}
}
