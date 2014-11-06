package org.jacorb.imr;

/**
 * Generated from IDL struct "ImRInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ImRInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ImRInfo(){}
	public java.lang.String host = "";
	public int port;
	public ImRInfo(java.lang.String host, int port)
	{
		this.host = host;
		this.port = port;
	}
}
