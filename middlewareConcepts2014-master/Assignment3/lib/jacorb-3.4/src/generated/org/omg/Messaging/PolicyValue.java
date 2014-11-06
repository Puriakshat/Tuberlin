package org.omg.Messaging;

/**
 * Generated from IDL struct "PolicyValue".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PolicyValue
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PolicyValue(){}
	public int ptype;
	public byte[] pvalue;
	public PolicyValue(int ptype, byte[] pvalue)
	{
		this.ptype = ptype;
		this.pvalue = pvalue;
	}
}
