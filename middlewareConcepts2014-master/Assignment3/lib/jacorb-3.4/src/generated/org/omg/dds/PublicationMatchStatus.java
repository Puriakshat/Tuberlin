package org.omg.dds;

/**
 * Generated from IDL struct "PublicationMatchStatus".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PublicationMatchStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PublicationMatchStatus(){}
	public int total_count;
	public int total_count_change;
	public int last_subscription_handle;
	public PublicationMatchStatus(int total_count, int total_count_change, int last_subscription_handle)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_subscription_handle = last_subscription_handle;
	}
}
