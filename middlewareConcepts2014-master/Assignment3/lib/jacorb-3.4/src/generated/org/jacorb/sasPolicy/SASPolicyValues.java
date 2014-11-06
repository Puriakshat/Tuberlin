package org.jacorb.sasPolicy;

/**
 * Generated from IDL struct "SASPolicyValues".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SASPolicyValues
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public SASPolicyValues(){}
	public short targetRequires;
	public short targetSupports;
	public boolean stateful;
	public SASPolicyValues(short targetRequires, short targetSupports, boolean stateful)
	{
		this.targetRequires = targetRequires;
		this.targetSupports = targetSupports;
		this.stateful = stateful;
	}
}
