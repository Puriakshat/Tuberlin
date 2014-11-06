package org.omg.CORBA;

/**
 * Generated from IDL alias "DomainManagersList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DomainManagersListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.DomainManager[] value;

	public DomainManagersListHolder ()
	{
	}
	public DomainManagersListHolder (final org.omg.CORBA.DomainManager[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DomainManagersListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DomainManagersListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DomainManagersListHelper.write (out,value);
	}
}
