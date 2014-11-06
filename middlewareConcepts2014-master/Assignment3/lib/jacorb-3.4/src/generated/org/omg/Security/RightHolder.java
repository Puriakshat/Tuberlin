package org.omg.Security;

/**
 * Generated from IDL struct "Right".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RightHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.Right value;

	public RightHolder ()
	{
	}
	public RightHolder(final org.omg.Security.Right initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.RightHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.RightHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.RightHelper.write(_out, value);
	}
}
