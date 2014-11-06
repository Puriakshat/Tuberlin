package org.omg.PortableGroup;

/**
 * Generated from IDL interface "ObjectGroupManager".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ObjectGroupManagerHolder	implements org.omg.CORBA.portable.Streamable{
	 public ObjectGroupManager value;
	public ObjectGroupManagerHolder()
	{
	}
	public ObjectGroupManagerHolder (final ObjectGroupManager initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ObjectGroupManagerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectGroupManagerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ObjectGroupManagerHelper.write (_out,value);
	}
}
