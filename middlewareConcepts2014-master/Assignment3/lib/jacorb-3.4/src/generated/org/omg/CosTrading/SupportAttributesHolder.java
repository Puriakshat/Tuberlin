package org.omg.CosTrading;

/**
 * Generated from IDL interface "SupportAttributes".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SupportAttributesHolder	implements org.omg.CORBA.portable.Streamable{
	 public SupportAttributes value;
	public SupportAttributesHolder()
	{
	}
	public SupportAttributesHolder (final SupportAttributes initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SupportAttributesHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SupportAttributesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SupportAttributesHelper.write (_out,value);
	}
}
