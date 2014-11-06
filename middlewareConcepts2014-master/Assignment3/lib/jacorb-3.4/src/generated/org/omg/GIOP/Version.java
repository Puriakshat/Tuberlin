package org.omg.GIOP;

/**
 * Generated from IDL struct "Version".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Version
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Version(){}
	public byte major;
	public byte minor;
	public Version(byte major, byte minor)
	{
		this.major = major;
		this.minor = minor;
	}
}
