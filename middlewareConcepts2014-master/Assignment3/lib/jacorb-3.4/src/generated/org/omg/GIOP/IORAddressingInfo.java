package org.omg.GIOP;

/**
 * Generated from IDL struct "IORAddressingInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IORAddressingInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IORAddressingInfo(){}
	public int selected_profile_index;
	public org.omg.IOP.IOR ior;
	public IORAddressingInfo(int selected_profile_index, org.omg.IOP.IOR ior)
	{
		this.selected_profile_index = selected_profile_index;
		this.ior = ior;
	}
}
