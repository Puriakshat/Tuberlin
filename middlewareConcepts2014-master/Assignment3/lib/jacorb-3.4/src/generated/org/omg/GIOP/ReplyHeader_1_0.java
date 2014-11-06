package org.omg.GIOP;

/**
 * Generated from IDL struct "ReplyHeader_1_0".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ReplyHeader_1_0
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ReplyHeader_1_0(){}
	public org.omg.IOP.ServiceContext[] service_context;
	public int request_id;
	public org.omg.GIOP.ReplyStatusType_1_0 reply_status;
	public ReplyHeader_1_0(org.omg.IOP.ServiceContext[] service_context, int request_id, org.omg.GIOP.ReplyStatusType_1_0 reply_status)
	{
		this.service_context = service_context;
		this.request_id = request_id;
		this.reply_status = reply_status;
	}
}
