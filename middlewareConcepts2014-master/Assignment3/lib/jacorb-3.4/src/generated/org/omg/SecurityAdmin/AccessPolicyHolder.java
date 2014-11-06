package org.omg.SecurityAdmin;

/**
 * Generated from IDL interface "AccessPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AccessPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public AccessPolicy value;
	public AccessPolicyHolder()
	{
	}
	public AccessPolicyHolder (final AccessPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AccessPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AccessPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AccessPolicyHelper.write (_out,value);
	}
}
