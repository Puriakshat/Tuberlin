package org.omg.Security;
/**
 * Generated from IDL enum "RequiresSupports".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RequiresSupportsHolder
	implements org.omg.CORBA.portable.Streamable
{
	public RequiresSupports value;

	public RequiresSupportsHolder ()
	{
	}
	public RequiresSupportsHolder (final RequiresSupports initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RequiresSupportsHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequiresSupportsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RequiresSupportsHelper.write (out,value);
	}
}
