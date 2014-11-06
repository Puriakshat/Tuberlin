package org.jacorb.imr;

/**
 * Generated from IDL alias "POAInfoSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class POAInfoSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.jacorb.imr.POAInfo[] value;

	public POAInfoSeqHolder ()
	{
	}
	public POAInfoSeqHolder (final org.jacorb.imr.POAInfo[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return POAInfoSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = POAInfoSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		POAInfoSeqHelper.write (out,value);
	}
}
