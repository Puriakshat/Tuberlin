package org.jacorb.sasPolicy;

/**
 * Generated from IDL interface "SASPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SASPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public SASPolicy value;
	public SASPolicyHolder()
	{
	}
	public SASPolicyHolder (final SASPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SASPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SASPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SASPolicyHelper.write (_out,value);
	}
}
