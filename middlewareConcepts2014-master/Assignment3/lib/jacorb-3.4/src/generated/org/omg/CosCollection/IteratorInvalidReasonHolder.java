package org.omg.CosCollection;
/**
 * Generated from IDL enum "IteratorInvalidReason".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IteratorInvalidReasonHolder
	implements org.omg.CORBA.portable.Streamable
{
	public IteratorInvalidReason value;

	public IteratorInvalidReasonHolder ()
	{
	}
	public IteratorInvalidReasonHolder (final IteratorInvalidReason initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IteratorInvalidReasonHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IteratorInvalidReasonHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IteratorInvalidReasonHelper.write (out,value);
	}
}
