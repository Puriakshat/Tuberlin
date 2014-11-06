package org.omg.CosNaming.NamingContextPackage;

/**
 * Generated from IDL exception "CannotProceed".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CannotProceed
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CannotProceed()
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id());
	}

	public org.omg.CosNaming.NamingContext cxt;
	public org.omg.CosNaming.NameComponent[] rest_of_name;
	public CannotProceed(java.lang.String _reason,org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(_reason);
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
	public CannotProceed(org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id());
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
}
