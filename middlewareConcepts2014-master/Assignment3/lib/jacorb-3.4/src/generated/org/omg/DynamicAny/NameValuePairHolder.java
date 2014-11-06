package org.omg.DynamicAny;

/**
 * Generated from IDL struct "NameValuePair".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class NameValuePairHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.NameValuePair value;

	public NameValuePairHolder ()
	{
	}
	public NameValuePairHolder(final org.omg.DynamicAny.NameValuePair initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DynamicAny.NameValuePairHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DynamicAny.NameValuePairHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DynamicAny.NameValuePairHelper.write(_out, value);
	}
}
