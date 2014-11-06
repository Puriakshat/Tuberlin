package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL struct "StartupInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StartupInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.tao_imr.ImplementationRepository.StartupInfo value;

	public StartupInfoHolder ()
	{
	}
	public StartupInfoHolder(final org.jacorb.tao_imr.ImplementationRepository.StartupInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.tao_imr.ImplementationRepository.StartupInfoHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.tao_imr.ImplementationRepository.StartupInfoHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.tao_imr.ImplementationRepository.StartupInfoHelper.write(_out, value);
	}
}
