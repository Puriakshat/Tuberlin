package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "MandatoryProperty".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MandatoryPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.MandatoryProperty value;

	public MandatoryPropertyHolder ()
	{
	}
	public MandatoryPropertyHolder(final org.omg.CosTrading.RegisterPackage.MandatoryProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.MandatoryPropertyHelper.write(_out, value);
	}
}
