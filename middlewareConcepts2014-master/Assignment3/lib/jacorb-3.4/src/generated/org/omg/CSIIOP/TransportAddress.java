package org.omg.CSIIOP;

/**
 * Generated from IDL struct "TransportAddress".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TransportAddress
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TransportAddress(){}
	public java.lang.String host_name = "";
	public short port;
	public TransportAddress(java.lang.String host_name, short port)
	{
		this.host_name = host_name;
		this.port = port;
	}
}
