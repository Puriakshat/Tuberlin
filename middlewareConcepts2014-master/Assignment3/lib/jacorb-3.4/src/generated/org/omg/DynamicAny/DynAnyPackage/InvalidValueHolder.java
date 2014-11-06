package org.omg.DynamicAny.DynAnyPackage;

/**
 * Generated from IDL exception "InvalidValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidValueHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.DynAnyPackage.InvalidValue value;

	public InvalidValueHolder ()
	{
	}
	public InvalidValueHolder(final org.omg.DynamicAny.DynAnyPackage.InvalidValue initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper.write(_out, value);
	}
}
