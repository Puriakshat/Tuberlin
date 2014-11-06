package org.omg.CORBA;

/**
 * Generated from IDL alias "ValueDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ValueDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ValueDef[] value;

	public ValueDefSeqHolder ()
	{
	}
	public ValueDefSeqHolder (final org.omg.CORBA.ValueDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ValueDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ValueDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ValueDefSeqHelper.write (out,value);
	}
}
