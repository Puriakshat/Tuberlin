package org.omg.PortableGroup;

/**
 * Generated from IDL interface "PropertyManager".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PropertyManagerHolder	implements org.omg.CORBA.portable.Streamable{
	 public PropertyManager value;
	public PropertyManagerHolder()
	{
	}
	public PropertyManagerHolder (final PropertyManager initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PropertyManagerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyManagerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PropertyManagerHelper.write (_out,value);
	}
}
