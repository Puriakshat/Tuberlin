package org.omg.ATLAS;


/**
 * Generated from IDL interface "AuthTokenDispenser".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public interface AuthTokenDispenserOperations
{
	/* constants */
	/* operations  */
	org.omg.ATLAS.AuthTokenData get_my_authorization_token() throws org.omg.ATLAS.IllegalTokenRequest;
	org.omg.ATLAS.AuthTokenData translate_authorization_token(org.omg.CSI.IdentityToken the_subject, org.omg.CSI.AuthorizationElement[] the_token) throws org.omg.ATLAS.IllegalTokenRequest,org.omg.ATLAS.TokenOkay;
}
