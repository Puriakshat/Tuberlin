package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL struct "StartupOptions".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StartupOptionsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.tao_imr.ImplementationRepository.StartupOptions value;

	public StartupOptionsHolder ()
	{
	}
	public StartupOptionsHolder(final org.jacorb.tao_imr.ImplementationRepository.StartupOptions initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.tao_imr.ImplementationRepository.StartupOptionsHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.tao_imr.ImplementationRepository.StartupOptionsHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.tao_imr.ImplementationRepository.StartupOptionsHelper.write(_out, value);
	}
}
