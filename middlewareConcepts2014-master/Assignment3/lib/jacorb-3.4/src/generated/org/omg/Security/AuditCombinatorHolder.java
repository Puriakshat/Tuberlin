package org.omg.Security;
/**
 * Generated from IDL enum "AuditCombinator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AuditCombinatorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public AuditCombinator value;

	public AuditCombinatorHolder ()
	{
	}
	public AuditCombinatorHolder (final AuditCombinator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AuditCombinatorHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuditCombinatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AuditCombinatorHelper.write (out,value);
	}
}
