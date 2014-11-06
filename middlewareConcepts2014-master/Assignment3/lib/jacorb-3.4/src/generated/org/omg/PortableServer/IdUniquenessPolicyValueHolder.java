package org.omg.PortableServer;
/**
 * Generated from IDL enum "IdUniquenessPolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IdUniquenessPolicyValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public IdUniquenessPolicyValue value;

	public IdUniquenessPolicyValueHolder ()
	{
	}
	public IdUniquenessPolicyValueHolder (final IdUniquenessPolicyValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IdUniquenessPolicyValueHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdUniquenessPolicyValueHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IdUniquenessPolicyValueHelper.write (out,value);
	}
}
