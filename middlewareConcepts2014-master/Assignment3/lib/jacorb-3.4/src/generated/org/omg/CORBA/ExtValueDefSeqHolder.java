package org.omg.CORBA;

/**
 * Generated from IDL alias "ExtValueDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtValueDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExtValueDef[] value;

	public ExtValueDefSeqHolder ()
	{
	}
	public ExtValueDefSeqHolder (final org.omg.CORBA.ExtValueDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtValueDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtValueDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExtValueDefSeqHelper.write (out,value);
	}
}
