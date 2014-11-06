package org.omg.PortableGroup;

/**
 * Generated from IDL alias "Properties".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PropertiesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.Property[] value;

	public PropertiesHolder ()
	{
	}
	public PropertiesHolder (final org.omg.PortableGroup.Property[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertiesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertiesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertiesHelper.write (out,value);
	}
}
