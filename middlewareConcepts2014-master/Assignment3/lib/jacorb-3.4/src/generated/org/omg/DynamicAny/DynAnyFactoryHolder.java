package org.omg.DynamicAny;

/**
 * Generated from IDL interface "DynAnyFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DynAnyFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public DynAnyFactory value;
	public DynAnyFactoryHolder()
	{
	}
	public DynAnyFactoryHolder (final DynAnyFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DynAnyFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DynAnyFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DynAnyFactoryHelper.write (_out,value);
	}
}
