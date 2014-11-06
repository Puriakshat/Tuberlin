package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "CallbackNotFound".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CallbackNotFoundHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.CallbackNotFound value;

	public CallbackNotFoundHolder ()
	{
	}
	public CallbackNotFoundHolder(final org.omg.CosNotifyFilter.CallbackNotFound initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.CallbackNotFoundHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.CallbackNotFoundHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.CallbackNotFoundHelper.write(_out, value);
	}
}
