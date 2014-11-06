package org.omg.ATLAS;

/**
 * Generated from IDL struct "CosNamingLocator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CosNamingLocatorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.ATLAS.CosNamingLocator value;

	public CosNamingLocatorHolder ()
	{
	}
	public CosNamingLocatorHolder(final org.omg.ATLAS.CosNamingLocator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.ATLAS.CosNamingLocatorHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.ATLAS.CosNamingLocatorHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.ATLAS.CosNamingLocatorHelper.write(_out, value);
	}
}
