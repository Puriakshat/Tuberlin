package org.omg.CosNotification;

/**
 * Generated from IDL struct "StructuredEvent".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StructuredEvent
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public StructuredEvent(){}
	public org.omg.CosNotification.EventHeader header;
	public org.omg.CosNotification.Property[] filterable_data;
	public org.omg.CORBA.Any remainder_of_body;
	public StructuredEvent(org.omg.CosNotification.EventHeader header, org.omg.CosNotification.Property[] filterable_data, org.omg.CORBA.Any remainder_of_body)
	{
		this.header = header;
		this.filterable_data = filterable_data;
		this.remainder_of_body = remainder_of_body;
	}
}
