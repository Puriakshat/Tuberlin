package org.omg.CosTrading.LookupPackage;
/**
 * Generated from IDL union "SpecifiedProps".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SpecifiedPropsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SpecifiedProps value;

	public SpecifiedPropsHolder ()
	{
	}
	public SpecifiedPropsHolder (final SpecifiedProps initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SpecifiedPropsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SpecifiedPropsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SpecifiedPropsHelper.write (out, value);
	}
}
