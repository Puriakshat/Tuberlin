package org.omg.CosNotifyFilter;

/**
 * Generated from IDL exception "UnsupportedFilterableData".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnsupportedFilterableDataHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.UnsupportedFilterableData value;

	public UnsupportedFilterableDataHolder ()
	{
	}
	public UnsupportedFilterableDataHolder(final org.omg.CosNotifyFilter.UnsupportedFilterableData initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosNotifyFilter.UnsupportedFilterableDataHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosNotifyFilter.UnsupportedFilterableDataHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosNotifyFilter.UnsupportedFilterableDataHelper.write(_out, value);
	}
}
