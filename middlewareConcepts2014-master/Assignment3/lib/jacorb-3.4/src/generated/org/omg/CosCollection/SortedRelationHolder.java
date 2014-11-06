package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedRelation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SortedRelationHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedRelation value;
	public SortedRelationHolder()
	{
	}
	public SortedRelationHolder (final SortedRelation initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedRelationHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedRelationHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedRelationHelper.write (_out,value);
	}
}
