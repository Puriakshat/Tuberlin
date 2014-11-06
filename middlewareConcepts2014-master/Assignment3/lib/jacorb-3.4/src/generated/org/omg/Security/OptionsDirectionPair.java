package org.omg.Security;

/**
 * Generated from IDL struct "OptionsDirectionPair".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OptionsDirectionPair
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public OptionsDirectionPair(){}
	public short options;
	public org.omg.Security.CommunicationDirection direction;
	public OptionsDirectionPair(short options, org.omg.Security.CommunicationDirection direction)
	{
		this.options = options;
		this.direction = direction;
	}
}
