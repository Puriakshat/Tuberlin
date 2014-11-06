package org.omg.IOP;

/**
 * Generated from IDL struct "IOR".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IOR
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IOR(){}
	public java.lang.String type_id = "";
	public org.omg.IOP.TaggedProfile[] profiles;
	public IOR(java.lang.String type_id, org.omg.IOP.TaggedProfile[] profiles)
	{
		this.type_id = type_id;
		this.profiles = profiles;
	}
}
