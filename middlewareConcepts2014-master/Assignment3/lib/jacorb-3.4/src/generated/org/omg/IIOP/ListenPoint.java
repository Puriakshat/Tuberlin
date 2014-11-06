package org.omg.IIOP;

/**
 * Generated from IDL struct "ListenPoint".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ListenPoint
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ListenPoint(){}
	public java.lang.String host = "";
	public short port;
	public ListenPoint(java.lang.String host, short port)
	{
		this.host = host;
		this.port = port;
	}
}
