package org.omg.DynamicAny.DynAnyFactoryPackage;

/**
 * Generated from IDL exception "InconsistentTypeCode".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InconsistentTypeCodeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode value;

	public InconsistentTypeCodeHolder ()
	{
	}
	public InconsistentTypeCodeHolder(final org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCodeHelper.write(_out, value);
	}
}
