package org.omg.dds;

/**
 * Generated from IDL alias "TopicSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TopicSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.Topic[] value;

	public TopicSeqHolder ()
	{
	}
	public TopicSeqHolder (final org.omg.dds.Topic[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TopicSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopicSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TopicSeqHelper.write (out,value);
	}
}
