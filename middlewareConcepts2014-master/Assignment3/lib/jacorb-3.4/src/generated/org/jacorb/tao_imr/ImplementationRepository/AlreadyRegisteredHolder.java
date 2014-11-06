package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL exception "AlreadyRegistered".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AlreadyRegisteredHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered value;

	public AlreadyRegisteredHolder ()
	{
	}
	public AlreadyRegisteredHolder(final org.jacorb.tao_imr.ImplementationRepository.AlreadyRegistered initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.tao_imr.ImplementationRepository.AlreadyRegisteredHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.tao_imr.ImplementationRepository.AlreadyRegisteredHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.tao_imr.ImplementationRepository.AlreadyRegisteredHelper.write(_out, value);
	}
}
