package org.omg.IOP;

/**
 * Generated from IDL struct "TaggedProfile".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TaggedProfile
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TaggedProfile(){}
	public int tag;
	public byte[] profile_data;
	public TaggedProfile(int tag, byte[] profile_data)
	{
		this.tag = tag;
		this.profile_data = profile_data;
	}
}
