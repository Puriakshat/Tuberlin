package org.omg.IIOP;

/**
 * Generated from IDL struct "BiDirIIOPServiceContext".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BiDirIIOPServiceContext
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public BiDirIIOPServiceContext(){}
	public org.omg.IIOP.ListenPoint[] listen_points;
	public BiDirIIOPServiceContext(org.omg.IIOP.ListenPoint[] listen_points)
	{
		this.listen_points = listen_points;
	}
}
