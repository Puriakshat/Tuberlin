package org.omg.CosNaming.NamingContextPackage;

/**
 * Generated from IDL exception "NotFound".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNaming.NamingContextPackage.NotFound value;

	public NotFoundHolder ()
	{
	}
	public NotFoundHolder(final org.omg.CosNaming.NamingContextPackage.NotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNaming.NamingContextPackage.NotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNaming.NamingContextPackage.NotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNaming.NamingContextPackage.NotFoundHelper.write(_out, value);
	}
}
