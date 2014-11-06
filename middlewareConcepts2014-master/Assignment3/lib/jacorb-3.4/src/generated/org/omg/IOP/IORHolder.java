package org.omg.IOP;

/**
 * Generated from IDL struct "IOR".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IORHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.IOR value;

	public IORHolder ()
	{
	}
	public IORHolder(final org.omg.IOP.IOR initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.IOP.IORHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.IOP.IORHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.IOP.IORHelper.write(_out, value);
	}
}
