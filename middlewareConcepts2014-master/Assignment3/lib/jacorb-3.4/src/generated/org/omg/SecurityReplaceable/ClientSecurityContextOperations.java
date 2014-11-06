package org.omg.SecurityReplaceable;


/**
 * Generated from IDL interface "ClientSecurityContext".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ClientSecurityContextOperations
	extends org.omg.SecurityReplaceable.SecurityContextOperations
{
	/* constants */
	/* operations  */
	short association_options_used();
	org.omg.Security.DelegationMode delegation_mode();
	byte[] mech_data();
	org.omg.SecurityLevel2.Credentials client_credentials();
	short server_options_supported();
	byte[] server_security_name();
}
