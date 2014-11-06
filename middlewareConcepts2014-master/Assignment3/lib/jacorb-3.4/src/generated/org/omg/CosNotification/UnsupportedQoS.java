package org.omg.CosNotification;

/**
 * Generated from IDL exception "UnsupportedQoS".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class UnsupportedQoS
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public UnsupportedQoS()
	{
		super(org.omg.CosNotification.UnsupportedQoSHelper.id());
	}

	public org.omg.CosNotification.PropertyError[] qos_err;
	public UnsupportedQoS(java.lang.String _reason,org.omg.CosNotification.PropertyError[] qos_err)
	{
		super(_reason);
		this.qos_err = qos_err;
	}
	public UnsupportedQoS(org.omg.CosNotification.PropertyError[] qos_err)
	{
		super(org.omg.CosNotification.UnsupportedQoSHelper.id());
		this.qos_err = qos_err;
	}
}
