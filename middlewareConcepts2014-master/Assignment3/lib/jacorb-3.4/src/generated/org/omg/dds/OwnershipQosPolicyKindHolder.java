package org.omg.dds;
/**
 * Generated from IDL enum "OwnershipQosPolicyKind".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OwnershipQosPolicyKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public OwnershipQosPolicyKind value;

	public OwnershipQosPolicyKindHolder ()
	{
	}
	public OwnershipQosPolicyKindHolder (final OwnershipQosPolicyKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OwnershipQosPolicyKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OwnershipQosPolicyKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OwnershipQosPolicyKindHelper.write (out,value);
	}
}
