package org.omg.dds;

/**
 * Generated from IDL struct "PresentationQosPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PresentationQosPolicy
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PresentationQosPolicy(){}
	public org.omg.dds.PresentationQosPolicyAccessScopeKind access_scope;
	public boolean coherent_access;
	public boolean ordered_access;
	public PresentationQosPolicy(org.omg.dds.PresentationQosPolicyAccessScopeKind access_scope, boolean coherent_access, boolean ordered_access)
	{
		this.access_scope = access_scope;
		this.coherent_access = coherent_access;
		this.ordered_access = ordered_access;
	}
}
