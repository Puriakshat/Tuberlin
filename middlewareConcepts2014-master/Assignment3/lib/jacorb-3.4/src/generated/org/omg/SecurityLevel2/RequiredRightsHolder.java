package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "RequiredRights".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RequiredRightsHolder	implements org.omg.CORBA.portable.Streamable{
	 public RequiredRights value;
	public RequiredRightsHolder()
	{
	}
	public RequiredRightsHolder (final RequiredRights initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RequiredRightsHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RequiredRightsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RequiredRightsHelper.write (_out,value);
	}
}
