package org.omg.PortableGroup;

/**
 * Generated from IDL exception "MemberAlreadyPresent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MemberAlreadyPresentHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.MemberAlreadyPresent value;

	public MemberAlreadyPresentHolder ()
	{
	}
	public MemberAlreadyPresentHolder(final org.omg.PortableGroup.MemberAlreadyPresent initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableGroup.MemberAlreadyPresentHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableGroup.MemberAlreadyPresentHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableGroup.MemberAlreadyPresentHelper.write(_out, value);
	}
}
