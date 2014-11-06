package org.omg.GIOP;

/**
 * Generated from IDL struct "CancelRequestHeader".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CancelRequestHeader
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CancelRequestHeader(){}
	public int request_id;
	public CancelRequestHeader(int request_id)
	{
		this.request_id = request_id;
	}
}
