package org.omg.Security;

/**
 * Generated from IDL struct "SecAttribute".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SecAttributeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.SecAttribute value;

	public SecAttributeHolder ()
	{
	}
	public SecAttributeHolder(final org.omg.Security.SecAttribute initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.SecAttributeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.SecAttributeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.SecAttributeHelper.write(_out, value);
	}
}
