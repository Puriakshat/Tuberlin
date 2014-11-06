package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "InvalidObjectRef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InvalidObjectRefHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.InvalidObjectRef value;

	public InvalidObjectRefHolder ()
	{
	}
	public InvalidObjectRefHolder(final org.omg.CosTrading.RegisterPackage.InvalidObjectRef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.InvalidObjectRefHelper.write(_out, value);
	}
}
