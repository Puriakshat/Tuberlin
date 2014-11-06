package org.omg.Security;

/**
 * Generated from IDL struct "SecurityMechanismData".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SecurityMechanismDataHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.SecurityMechanismData value;

	public SecurityMechanismDataHolder ()
	{
	}
	public SecurityMechanismDataHolder(final org.omg.Security.SecurityMechanismData initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.Security.SecurityMechanismDataHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.Security.SecurityMechanismDataHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.Security.SecurityMechanismDataHelper.write(_out, value);
	}
}
