package org.omg.CSIIOP;

/**
 * Generated from IDL struct "CompoundSecMech".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CompoundSecMech
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CompoundSecMech(){}
	public short target_requires;
	public org.omg.IOP.TaggedComponent transport_mech;
	public org.omg.CSIIOP.AS_ContextSec as_context_mech;
	public org.omg.CSIIOP.SAS_ContextSec sas_context_mech;
	public CompoundSecMech(short target_requires, org.omg.IOP.TaggedComponent transport_mech, org.omg.CSIIOP.AS_ContextSec as_context_mech, org.omg.CSIIOP.SAS_ContextSec sas_context_mech)
	{
		this.target_requires = target_requires;
		this.transport_mech = transport_mech;
		this.as_context_mech = as_context_mech;
		this.sas_context_mech = sas_context_mech;
	}
}
