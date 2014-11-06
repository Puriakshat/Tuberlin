package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "Credentials".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface CredentialsOperations
{
	/* constants */
	/* operations  */
	org.omg.SecurityLevel2.Credentials copy();
	void destroy();
	org.omg.Security.InvocationCredentialsType credentials_type();
	org.omg.Security.AuthenticationStatus authentication_state();
	java.lang.String mechanism();
	short accepting_options_supported();
	void accepting_options_supported(short arg);
	short accepting_options_required();
	void accepting_options_required(short arg);
	short invocation_options_supported();
	void invocation_options_supported(short arg);
	short invocation_options_required();
	void invocation_options_required(short arg);
	boolean get_security_feature(org.omg.Security.CommunicationDirection direction, org.omg.Security.SecurityFeature feature);
	boolean set_privileges(boolean force_commit, org.omg.Security.SecAttribute[] requested_privileges, org.omg.Security.AttributeListHolder actual_privileges);
	org.omg.Security.SecAttribute[] get_attributes(org.omg.Security.AttributeType[] attributes);
	boolean is_valid(org.omg.TimeBase.UtcTHolder expiry_time);
	boolean refresh(byte[] refresh_data);
}
