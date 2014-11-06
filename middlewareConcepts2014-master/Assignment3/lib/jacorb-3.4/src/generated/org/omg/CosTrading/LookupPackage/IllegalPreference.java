package org.omg.CosTrading.LookupPackage;

/**
 * Generated from IDL exception "IllegalPreference".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class IllegalPreference
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public IllegalPreference()
	{
		super(org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.id());
	}

	public java.lang.String pref = "";
	public IllegalPreference(java.lang.String _reason,java.lang.String pref)
	{
		super(_reason);
		this.pref = pref;
	}
	public IllegalPreference(java.lang.String pref)
	{
		super(org.omg.CosTrading.LookupPackage.IllegalPreferenceHelper.id());
		this.pref = pref;
	}
}
