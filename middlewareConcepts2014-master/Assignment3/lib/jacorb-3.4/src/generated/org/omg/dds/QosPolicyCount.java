package org.omg.dds;

/**
 * Generated from IDL struct "QosPolicyCount".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class QosPolicyCount
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public QosPolicyCount(){}
	public int policy_id;
	public int count;
	public QosPolicyCount(int policy_id, int count)
	{
		this.policy_id = policy_id;
		this.count = count;
	}
}
