package org.omg.CORBA;

/**
 * Generated from IDL interface "Policy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public Policy value;
	public PolicyHolder()
	{
	}
	public PolicyHolder (final Policy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PolicyHelper.write (_out,value);
	}
}
