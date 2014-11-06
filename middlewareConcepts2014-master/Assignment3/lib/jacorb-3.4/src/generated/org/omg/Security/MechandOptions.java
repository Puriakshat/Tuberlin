package org.omg.Security;

/**
 * Generated from IDL struct "MechandOptions".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MechandOptions
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public MechandOptions(){}
	public java.lang.String mechanism_type = "";
	public short options_supported;
	public MechandOptions(java.lang.String mechanism_type, short options_supported)
	{
		this.mechanism_type = mechanism_type;
		this.options_supported = options_supported;
	}
}
