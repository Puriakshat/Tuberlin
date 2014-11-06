package org.omg.Security;

/**
 * Generated from IDL struct "SecurityMechanismData".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SecurityMechanismData
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SecurityMechanismData(){}
	public java.lang.String mechanism = "";
	public java.lang.String security_name = "";
	public short options_supported;
	public short options_required;
	public SecurityMechanismData(java.lang.String mechanism, java.lang.String security_name, short options_supported, short options_required)
	{
		this.mechanism = mechanism;
		this.security_name = security_name;
		this.options_supported = options_supported;
		this.options_required = options_required;
	}
}
