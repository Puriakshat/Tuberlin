package org.omg.CSIIOP;

/**
 * Generated from IDL struct "TLS_SEC_TRANS".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class TLS_SEC_TRANS
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TLS_SEC_TRANS(){}
	public short target_supports;
	public short target_requires;
	public org.omg.CSIIOP.TransportAddress[] addresses;
	public TLS_SEC_TRANS(short target_supports, short target_requires, org.omg.CSIIOP.TransportAddress[] addresses)
	{
		this.target_supports = target_supports;
		this.target_requires = target_requires;
		this.addresses = addresses;
	}
}
