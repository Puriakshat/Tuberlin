package org.omg.PortableGroup;

/**
 * Generated from IDL exception "ObjectNotCreated".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ObjectNotCreatedHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.ObjectNotCreated value;

	public ObjectNotCreatedHolder ()
	{
	}
	public ObjectNotCreatedHolder(final org.omg.PortableGroup.ObjectNotCreated initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableGroup.ObjectNotCreatedHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableGroup.ObjectNotCreatedHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableGroup.ObjectNotCreatedHelper.write(_out, value);
	}
}
