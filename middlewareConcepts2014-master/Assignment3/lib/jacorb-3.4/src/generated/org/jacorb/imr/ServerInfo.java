package org.jacorb.imr;

/**
 * Generated from IDL struct "ServerInfo".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServerInfo(){}
	public java.lang.String name = "";
	public java.lang.String command = "";
	public org.jacorb.imr.POAInfo[] poas;
	public java.lang.String host = "";
	public boolean active;
	public boolean holding;
	public ServerInfo(java.lang.String name, java.lang.String command, org.jacorb.imr.POAInfo[] poas, java.lang.String host, boolean active, boolean holding)
	{
		this.name = name;
		this.command = command;
		this.poas = poas;
		this.host = host;
		this.active = active;
		this.holding = holding;
	}
}
