package org.omg.dds;

/**
 * Generated from IDL struct "ParticipantBuiltinTopicData".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ParticipantBuiltinTopicDataHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.ParticipantBuiltinTopicData value;

	public ParticipantBuiltinTopicDataHolder ()
	{
	}
	public ParticipantBuiltinTopicDataHolder(final org.omg.dds.ParticipantBuiltinTopicData initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.ParticipantBuiltinTopicDataHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.ParticipantBuiltinTopicDataHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.ParticipantBuiltinTopicDataHelper.write(_out, value);
	}
}
