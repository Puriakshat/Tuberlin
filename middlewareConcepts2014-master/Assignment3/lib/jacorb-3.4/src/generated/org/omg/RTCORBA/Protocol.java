package org.omg.RTCORBA;

/**
 * Generated from IDL struct "Protocol".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class Protocol
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Protocol(){}
	public int protocol_type;
	public org.omg.RTCORBA.ProtocolProperties orb_protocol_properties;
	public org.omg.RTCORBA.ProtocolProperties transport_protocol_properties;
	public Protocol(int protocol_type, org.omg.RTCORBA.ProtocolProperties orb_protocol_properties, org.omg.RTCORBA.ProtocolProperties transport_protocol_properties)
	{
		this.protocol_type = protocol_type;
		this.orb_protocol_properties = orb_protocol_properties;
		this.transport_protocol_properties = transport_protocol_properties;
	}
}
