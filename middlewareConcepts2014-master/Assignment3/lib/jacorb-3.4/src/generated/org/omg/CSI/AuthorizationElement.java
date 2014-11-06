package org.omg.CSI;

/**
 * Generated from IDL struct "AuthorizationElement".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AuthorizationElement
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AuthorizationElement(){}
	public int the_type;
	public byte[] the_element;
	public AuthorizationElement(int the_type, byte[] the_element)
	{
		this.the_type = the_type;
		this.the_element = the_element;
	}
}
