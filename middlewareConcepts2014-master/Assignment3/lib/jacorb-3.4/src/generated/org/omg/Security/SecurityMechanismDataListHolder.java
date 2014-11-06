package org.omg.Security;

/**
 * Generated from IDL alias "SecurityMechanismDataList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SecurityMechanismDataListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.SecurityMechanismData[] value;

	public SecurityMechanismDataListHolder ()
	{
	}
	public SecurityMechanismDataListHolder (final org.omg.Security.SecurityMechanismData[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SecurityMechanismDataListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SecurityMechanismDataListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SecurityMechanismDataListHelper.write (out,value);
	}
}
