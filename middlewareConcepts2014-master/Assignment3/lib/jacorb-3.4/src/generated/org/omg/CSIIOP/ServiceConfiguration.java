package org.omg.CSIIOP;

/**
 * Generated from IDL struct "ServiceConfiguration".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServiceConfiguration
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServiceConfiguration(){}
	public int syntax;
	public byte[] name;
	public ServiceConfiguration(int syntax, byte[] name)
	{
		this.syntax = syntax;
		this.name = name;
	}
}
