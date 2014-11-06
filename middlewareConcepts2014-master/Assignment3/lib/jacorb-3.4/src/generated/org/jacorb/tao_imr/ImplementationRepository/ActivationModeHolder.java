package org.jacorb.tao_imr.ImplementationRepository;
/**
 * Generated from IDL enum "ActivationMode".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ActivationModeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ActivationMode value;

	public ActivationModeHolder ()
	{
	}
	public ActivationModeHolder (final ActivationMode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ActivationModeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ActivationModeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ActivationModeHelper.write (out,value);
	}
}
