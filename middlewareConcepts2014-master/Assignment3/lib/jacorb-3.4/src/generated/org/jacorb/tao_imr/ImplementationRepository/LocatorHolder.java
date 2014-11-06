package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL interface "Locator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LocatorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Locator value;
	public LocatorHolder()
	{
	}
	public LocatorHolder (final Locator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LocatorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LocatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LocatorHelper.write (_out,value);
	}
}
