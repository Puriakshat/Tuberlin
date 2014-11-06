package org.omg.IOP.CodecPackage;

/**
 * Generated from IDL exception "TypeMismatch".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TypeMismatchHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.CodecPackage.TypeMismatch value;

	public TypeMismatchHolder ()
	{
	}
	public TypeMismatchHolder(final org.omg.IOP.CodecPackage.TypeMismatch initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IOP.CodecPackage.TypeMismatchHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IOP.CodecPackage.TypeMismatchHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IOP.CodecPackage.TypeMismatchHelper.write(_out, value);
	}
}
