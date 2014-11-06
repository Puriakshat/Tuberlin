package org.omg.dds;
/**
 * Generated from IDL enum "DurabilityQosPolicyKind".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DurabilityQosPolicyKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public DurabilityQosPolicyKind value;

	public DurabilityQosPolicyKindHolder ()
	{
	}
	public DurabilityQosPolicyKindHolder (final DurabilityQosPolicyKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DurabilityQosPolicyKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DurabilityQosPolicyKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DurabilityQosPolicyKindHelper.write (out,value);
	}
}
