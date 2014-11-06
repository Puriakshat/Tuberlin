package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL alias "EnvironmentList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EnvironmentListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] value;

	public EnvironmentListHolder ()
	{
	}
	public EnvironmentListHolder (final org.jacorb.tao_imr.ImplementationRepository.EnvironmentVariable[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EnvironmentListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EnvironmentListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EnvironmentListHelper.write (out,value);
	}
}
