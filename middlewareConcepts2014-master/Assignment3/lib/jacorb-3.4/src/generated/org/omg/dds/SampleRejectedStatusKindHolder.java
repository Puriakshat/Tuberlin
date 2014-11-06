package org.omg.dds;
/**
 * Generated from IDL enum "SampleRejectedStatusKind".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SampleRejectedStatusKindHolder
	implements org.omg.CORBA.portable.Streamable
{
	public SampleRejectedStatusKind value;

	public SampleRejectedStatusKindHolder ()
	{
	}
	public SampleRejectedStatusKindHolder (final SampleRejectedStatusKind initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SampleRejectedStatusKindHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SampleRejectedStatusKindHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SampleRejectedStatusKindHelper.write (out,value);
	}
}
