package org.omg.dds;
/**
 * Generated from IDL enum "ReliabilityQosPolicyKind".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ReliabilityQosPolicyKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public ReliabilityQosPolicyKind value;

	public ReliabilityQosPolicyKindHolder ()
	{
	}
	public ReliabilityQosPolicyKindHolder (final ReliabilityQosPolicyKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ReliabilityQosPolicyKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ReliabilityQosPolicyKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ReliabilityQosPolicyKindHelper.write (out,value);
	}
}
