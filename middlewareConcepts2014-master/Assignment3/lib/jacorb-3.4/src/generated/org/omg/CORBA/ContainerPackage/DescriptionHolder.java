package org.omg.CORBA.ContainerPackage;

/**
 * Generated from IDL struct "Description".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ContainerPackage.Description value;

	public DescriptionHolder ()
	{
	}
	public DescriptionHolder(final org.omg.CORBA.ContainerPackage.Description initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ContainerPackage.DescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ContainerPackage.DescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ContainerPackage.DescriptionHelper.write(_out, value);
	}
}
