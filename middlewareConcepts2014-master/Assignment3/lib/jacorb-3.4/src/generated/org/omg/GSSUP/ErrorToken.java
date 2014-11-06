package org.omg.GSSUP;

/**
 * Generated from IDL struct "ErrorToken".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ErrorToken
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ErrorToken(){}
	public int error_code;
	public ErrorToken(int error_code)
	{
		this.error_code = error_code;
	}
}
