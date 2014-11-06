package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "UnknownPropertyName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnknownPropertyNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.UnknownPropertyName value;

	public UnknownPropertyNameHolder ()
	{
	}
	public UnknownPropertyNameHolder(final org.omg.CosTrading.RegisterPackage.UnknownPropertyName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.UnknownPropertyNameHelper.write(_out, value);
	}
}
