package org.jacorb.imr;

/**
 * Generated from IDL exception "ServerStartupFailed".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServerStartupFailed
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServerStartupFailed()
	{
		super(org.jacorb.imr.ServerStartupFailedHelper.id());
	}

	public java.lang.String reason = "";
	public ServerStartupFailed(java.lang.String _reason,java.lang.String reason)
	{
		super(_reason);
		this.reason = reason;
	}
	public ServerStartupFailed(java.lang.String reason)
	{
		super(org.jacorb.imr.ServerStartupFailedHelper.id());
		this.reason = reason;
	}
}
