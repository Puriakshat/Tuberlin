package org.omg.Security;
/**
 * Generated from IDL enum "DelegationDirective".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DelegationDirectiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public DelegationDirective value;

	public DelegationDirectiveHolder ()
	{
	}
	public DelegationDirectiveHolder (final DelegationDirective initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DelegationDirectiveHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DelegationDirectiveHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DelegationDirectiveHelper.write (out,value);
	}
}
