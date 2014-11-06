package org.omg.PortableGroup;

/**
 * Generated from IDL alias "FactoryInfos".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FactoryInfosHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.FactoryInfo[] value;

	public FactoryInfosHolder ()
	{
	}
	public FactoryInfosHolder (final org.omg.PortableGroup.FactoryInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FactoryInfosHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FactoryInfosHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FactoryInfosHelper.write (out,value);
	}
}
