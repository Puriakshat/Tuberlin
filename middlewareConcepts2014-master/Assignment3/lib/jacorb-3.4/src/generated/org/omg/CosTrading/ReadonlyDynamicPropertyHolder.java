package org.omg.CosTrading;

/**
 * Generated from IDL exception "ReadonlyDynamicProperty".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ReadonlyDynamicPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.ReadonlyDynamicProperty value;

	public ReadonlyDynamicPropertyHolder ()
	{
	}
	public ReadonlyDynamicPropertyHolder(final org.omg.CosTrading.ReadonlyDynamicProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.ReadonlyDynamicPropertyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.ReadonlyDynamicPropertyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.ReadonlyDynamicPropertyHelper.write(_out, value);
	}
}
