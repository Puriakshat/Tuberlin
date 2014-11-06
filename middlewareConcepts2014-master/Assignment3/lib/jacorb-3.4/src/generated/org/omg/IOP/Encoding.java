package org.omg.IOP;

/**
 * Generated from IDL struct "Encoding".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Encoding
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Encoding(){}
	public short format;
	public byte major_version;
	public byte minor_version;
	public Encoding(short format, byte major_version, byte minor_version)
	{
		this.format = format;
		this.major_version = major_version;
		this.minor_version = minor_version;
	}
}
