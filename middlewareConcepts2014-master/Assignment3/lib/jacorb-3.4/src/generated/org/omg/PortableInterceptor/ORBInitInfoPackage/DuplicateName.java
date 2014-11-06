package org.omg.PortableInterceptor.ORBInitInfoPackage;

/**
 * Generated from IDL exception "DuplicateName".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class DuplicateName
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DuplicateName()
	{
		super(org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper.id());
	}

	public java.lang.String name = "";
	public DuplicateName(java.lang.String _reason,java.lang.String name)
	{
		super(_reason);
		this.name = name;
	}
	public DuplicateName(java.lang.String name)
	{
		super(org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper.id());
		this.name = name;
	}
}
