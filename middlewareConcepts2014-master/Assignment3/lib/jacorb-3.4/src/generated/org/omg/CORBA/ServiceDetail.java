package org.omg.CORBA;

/**
 * Generated from IDL struct "ServiceDetail".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceDetail
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServiceDetail(){}
	public int service_detail_type;
	public byte[] service_detail;
	public ServiceDetail(int service_detail_type, byte[] service_detail)
	{
		this.service_detail_type = service_detail_type;
		this.service_detail = service_detail;
	}
}
