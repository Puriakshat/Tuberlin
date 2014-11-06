package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "EstablishTrustPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EstablishTrustPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public EstablishTrustPolicy value;
	public EstablishTrustPolicyHolder()
	{
	}
	public EstablishTrustPolicyHolder (final EstablishTrustPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EstablishTrustPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EstablishTrustPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EstablishTrustPolicyHelper.write (_out,value);
	}
}
