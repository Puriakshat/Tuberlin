package org.omg.PortableGroup;

/**
 * Generated from IDL interface "GOA".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class GOAHolder	implements org.omg.CORBA.portable.Streamable{
	 public GOA value;
	public GOAHolder()
	{
	}
	public GOAHolder (final GOA initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return GOAHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GOAHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		GOAHelper.write (_out,value);
	}
}
