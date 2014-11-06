package org.omg.PortableInterceptor;

/**
 * Generated from IDL exception "ForwardRequest".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ForwardRequest
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ForwardRequest()
	{
		super(org.omg.PortableInterceptor.ForwardRequestHelper.id());
	}

	public org.omg.CORBA.Object forward;
	public ForwardRequest(java.lang.String _reason,org.omg.CORBA.Object forward)
	{
		super(_reason);
		this.forward = forward;
	}
	public ForwardRequest(org.omg.CORBA.Object forward)
	{
		super(org.omg.PortableInterceptor.ForwardRequestHelper.id());
		this.forward = forward;
	}
}
