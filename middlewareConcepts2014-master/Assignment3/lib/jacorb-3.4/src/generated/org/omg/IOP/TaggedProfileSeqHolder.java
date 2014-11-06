package org.omg.IOP;

/**
 * Generated from IDL alias "TaggedProfileSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TaggedProfileSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.IOP.TaggedProfile[] value;

	public TaggedProfileSeqHolder ()
	{
	}
	public TaggedProfileSeqHolder (final org.omg.IOP.TaggedProfile[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TaggedProfileSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TaggedProfileSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TaggedProfileSeqHelper.write (out,value);
	}
}
