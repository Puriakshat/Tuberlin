package org.omg.GSSUP;

/**
 * Generated from IDL struct "InitialContextToken".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InitialContextToken
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public InitialContextToken(){}
	public byte[] username;
	public byte[] password;
	public byte[] target_name;
	public InitialContextToken(byte[] username, byte[] password, byte[] target_name)
	{
		this.username = username;
		this.password = password;
		this.target_name = target_name;
	}
}
