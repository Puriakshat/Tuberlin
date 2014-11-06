package org.omg.CORBA;

/**
 * Generated from IDL struct "ServiceInformation".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceInformation
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServiceInformation(){}
	public int[] service_options;
	public org.omg.CORBA.ServiceDetail[] service_details;
	public ServiceInformation(int[] service_options, org.omg.CORBA.ServiceDetail[] service_details)
	{
		this.service_options = service_options;
		this.service_details = service_details;
	}
}
