package org.omg.CosNotifyFilter;

/**
 * Generated from IDL alias "MappingConstraintPairSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MappingConstraintPairSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotifyFilter.MappingConstraintPair[] value;

	public MappingConstraintPairSeqHolder ()
	{
	}
	public MappingConstraintPairSeqHolder (final org.omg.CosNotifyFilter.MappingConstraintPair[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MappingConstraintPairSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MappingConstraintPairSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MappingConstraintPairSeqHelper.write (out,value);
	}
}
