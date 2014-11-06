package org.omg.dds;

/**
 * Generated from IDL struct "ParticipantBuiltinTopicData".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ParticipantBuiltinTopicData
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ParticipantBuiltinTopicData(){}
	public int[] key;
	public org.omg.dds.UserDataQosPolicy user_data;
	public ParticipantBuiltinTopicData(int[] key, org.omg.dds.UserDataQosPolicy user_data)
	{
		this.key = key;
		this.user_data = user_data;
	}
}
