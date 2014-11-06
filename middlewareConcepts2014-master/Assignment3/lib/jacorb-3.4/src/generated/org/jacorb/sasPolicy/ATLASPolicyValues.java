package org.jacorb.sasPolicy;

/**
 * Generated from IDL struct "ATLASPolicyValues".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ATLASPolicyValues
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ATLASPolicyValues(){}
	public java.lang.String atlasURL = "";
	public java.lang.String atlasCache = "";
	public ATLASPolicyValues(java.lang.String atlasURL, java.lang.String atlasCache)
	{
		this.atlasURL = atlasURL;
		this.atlasCache = atlasCache;
	}
}
