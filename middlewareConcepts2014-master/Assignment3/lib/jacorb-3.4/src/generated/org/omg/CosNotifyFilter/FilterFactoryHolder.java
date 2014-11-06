package org.omg.CosNotifyFilter;

/**
 * Generated from IDL interface "FilterFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FilterFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public FilterFactory value;
	public FilterFactoryHolder()
	{
	}
	public FilterFactoryHolder (final FilterFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FilterFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FilterFactoryHelper.write (_out,value);
	}
}
