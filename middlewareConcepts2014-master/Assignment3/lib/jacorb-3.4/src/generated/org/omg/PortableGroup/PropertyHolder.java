package org.omg.PortableGroup;

/**
 * Generated from IDL struct "Property".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.Property value;

	public PropertyHolder ()
	{
	}
	public PropertyHolder(final org.omg.PortableGroup.Property initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableGroup.PropertyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableGroup.PropertyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableGroup.PropertyHelper.write(_out, value);
	}
}
