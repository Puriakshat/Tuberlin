package org.omg.Security;

/**
 * Generated from IDL alias "AuditEventTypeList".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AuditEventTypeListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.Security.AuditEventType[] value;

	public AuditEventTypeListHolder ()
	{
	}
	public AuditEventTypeListHolder (final org.omg.Security.AuditEventType[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AuditEventTypeListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AuditEventTypeListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AuditEventTypeListHelper.write (out,value);
	}
}
