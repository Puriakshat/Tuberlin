package org.omg.CosTrading.RegisterPackage;

/**
 * Generated from IDL exception "ProxyOfferId".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ProxyOfferIdHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosTrading.RegisterPackage.ProxyOfferId value;

	public ProxyOfferIdHolder ()
	{
	}
	public ProxyOfferIdHolder(final org.omg.CosTrading.RegisterPackage.ProxyOfferId initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosTrading.RegisterPackage.ProxyOfferIdHelper.write(_out, value);
	}
}
