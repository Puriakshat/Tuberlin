package org.omg.CORBA.ValueDefPackage;

/**
 * Generated from IDL struct "FullValueDescription".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FullValueDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ValueDefPackage.FullValueDescription value;

	public FullValueDescriptionHolder ()
	{
	}
	public FullValueDescriptionHolder(final org.omg.CORBA.ValueDefPackage.FullValueDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.write(_out, value);
	}
}
