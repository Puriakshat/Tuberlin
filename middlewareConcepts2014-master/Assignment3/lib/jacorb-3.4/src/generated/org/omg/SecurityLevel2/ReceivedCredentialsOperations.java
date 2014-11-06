package org.omg.SecurityLevel2;


/**
 * Generated from IDL interface "ReceivedCredentials".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface ReceivedCredentialsOperations
	extends org.omg.SecurityLevel2.CredentialsOperations
{
	/* constants */
	/* operations  */
	org.omg.SecurityLevel2.Credentials accepting_credentials();
	short association_options_used();
	org.omg.Security.DelegationState delegation_state();
	org.omg.Security.DelegationMode delegation_mode();
}
