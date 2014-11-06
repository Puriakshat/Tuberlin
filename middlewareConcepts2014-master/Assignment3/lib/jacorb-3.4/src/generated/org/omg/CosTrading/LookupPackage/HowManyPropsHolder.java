package org.omg.CosTrading.LookupPackage;
/**
 * Generated from IDL enum "HowManyProps".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class HowManyPropsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public HowManyProps value;

	public HowManyPropsHolder ()
	{
	}
	public HowManyPropsHolder (final HowManyProps initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return HowManyPropsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HowManyPropsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		HowManyPropsHelper.write (out,value);
	}
}
