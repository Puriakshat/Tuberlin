package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL exception "NotFound".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.tao_imr.ImplementationRepository.NotFound value;

	public NotFoundHolder ()
	{
	}
	public NotFoundHolder(final org.jacorb.tao_imr.ImplementationRepository.NotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.jacorb.tao_imr.ImplementationRepository.NotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.jacorb.tao_imr.ImplementationRepository.NotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.jacorb.tao_imr.ImplementationRepository.NotFoundHelper.write(_out, value);
	}
}
