package org.omg.IOP;

/**
 * Generated from IDL struct "ServiceContext".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceContext
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServiceContext(){}
	public int context_id;
	public byte[] context_data;
	public ServiceContext(int context_id, byte[] context_data)
	{
		this.context_id = context_id;
		this.context_data = context_data;
	}
}
