package org.jacorb.tao_imr.ImplementationRepository;

/**
 * Generated from IDL interface "Administration".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AdministrationHolder	implements org.omg.CORBA.portable.Streamable{
	 public Administration value;
	public AdministrationHolder()
	{
	}
	public AdministrationHolder (final Administration initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AdministrationHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AdministrationHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AdministrationHelper.write (_out,value);
	}
}
