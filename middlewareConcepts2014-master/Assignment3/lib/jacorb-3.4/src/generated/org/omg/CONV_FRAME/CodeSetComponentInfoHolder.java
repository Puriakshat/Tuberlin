package org.omg.CONV_FRAME;

/**
 * Generated from IDL struct "CodeSetComponentInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CodeSetComponentInfoHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CONV_FRAME.CodeSetComponentInfo value;

	public CodeSetComponentInfoHolder ()
	{
	}
	public CodeSetComponentInfoHolder(final org.omg.CONV_FRAME.CodeSetComponentInfo initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CONV_FRAME.CodeSetComponentInfoHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CONV_FRAME.CodeSetComponentInfoHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CONV_FRAME.CodeSetComponentInfoHelper.write(_out, value);
	}
}
