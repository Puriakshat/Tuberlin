package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL interface "Activator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ActivatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Activator value;
	public ActivatorHolder()
	{
	}
	public ActivatorHolder (final Activator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ActivatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ActivatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ActivatorHelper.write (_out,value);
	}
}
