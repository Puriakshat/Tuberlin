package org.omg.GIOP;

/**
 * Generated from IDL struct "SystemExceptionReplyBody".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SystemExceptionReplyBody
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SystemExceptionReplyBody(){}
	public java.lang.String exception_id = "";
	public int minor_code_value;
	public int completion_status;
	public SystemExceptionReplyBody(java.lang.String exception_id, int minor_code_value, int completion_status)
	{
		this.exception_id = exception_id;
		this.minor_code_value = minor_code_value;
		this.completion_status = completion_status;
	}
}
