package org.omg.CORBA;

/**
 * Generated from IDL exception "UnknownUserException".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownUserExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.UnknownUserException value;

	public UnknownUserExceptionHolder ()
	{
	}
	public UnknownUserExceptionHolder(final org.omg.CORBA.UnknownUserException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.UnknownUserExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.UnknownUserExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.UnknownUserExceptionHelper.write(_out, value);
	}
}
