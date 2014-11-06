package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL struct "ServerInformation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerInformationHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.tao_imr.ImplementationRepository.ServerInformation value;

	public ServerInformationHolder ()
	{
	}
	public ServerInformationHolder(final org.jacorb.tao_imr.ImplementationRepository.ServerInformation initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.tao_imr.ImplementationRepository.ServerInformationHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.tao_imr.ImplementationRepository.ServerInformationHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.tao_imr.ImplementationRepository.ServerInformationHelper.write(_out, value);
	}
}
