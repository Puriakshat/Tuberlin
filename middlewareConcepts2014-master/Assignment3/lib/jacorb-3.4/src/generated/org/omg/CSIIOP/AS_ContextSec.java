package org.omg.CSIIOP;

/**
 * Generated from IDL struct "AS_ContextSec".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AS_ContextSec
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AS_ContextSec(){}
	public short target_supports;
	public short target_requires;
	public byte[] client_authentication_mech;
	public byte[] target_name;
	public AS_ContextSec(short target_supports, short target_requires, byte[] client_authentication_mech, byte[] target_name)
	{
		this.target_supports = target_supports;
		this.target_requires = target_requires;
		this.client_authentication_mech = client_authentication_mech;
		this.target_name = target_name;
	}
}
