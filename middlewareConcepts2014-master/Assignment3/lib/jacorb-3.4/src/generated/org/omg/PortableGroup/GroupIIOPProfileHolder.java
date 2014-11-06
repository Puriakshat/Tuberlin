package org.omg.PortableGroup;

/**
 * Generated from IDL alias "GroupIIOPProfile".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class GroupIIOPProfileHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public GroupIIOPProfileHolder ()
	{
	}
	public GroupIIOPProfileHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GroupIIOPProfileHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GroupIIOPProfileHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GroupIIOPProfileHelper.write (out,value);
	}
}
