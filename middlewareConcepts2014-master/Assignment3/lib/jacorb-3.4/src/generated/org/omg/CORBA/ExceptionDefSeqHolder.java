package org.omg.CORBA;

/**
 * Generated from IDL alias "ExceptionDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExceptionDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExceptionDef[] value;

	public ExceptionDefSeqHolder ()
	{
	}
	public ExceptionDefSeqHolder (final org.omg.CORBA.ExceptionDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExceptionDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExceptionDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExceptionDefSeqHelper.write (out,value);
	}
}
