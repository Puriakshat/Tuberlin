package org.omg.dds;

/**
 * Generated from IDL alias "ConditionSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConditionSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.Condition[] value;

	public ConditionSeqHolder ()
	{
	}
	public ConditionSeqHolder (final org.omg.dds.Condition[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConditionSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConditionSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConditionSeqHelper.write (out,value);
	}
}
