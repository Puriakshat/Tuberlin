package org.omg.SecurityAdmin;


/**
 * Generated from IDL interface "SecureInvocationPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface SecureInvocationPolicyOperations
	extends org.omg.CORBA.PolicyOperations
{
	/* constants */
	/* operations  */
	void set_association_options(org.omg.CORBA.InterfaceDef object_type, org.omg.Security.RequiresSupports requires_supports, org.omg.Security.CommunicationDirection direction, short options);
	short get_association_options(org.omg.CORBA.InterfaceDef object_type, org.omg.Security.RequiresSupports requires_supports, org.omg.Security.CommunicationDirection direction);
}
