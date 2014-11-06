package org.omg.SecurityLevel2;

/**
 * Generated from IDL interface "MechanismPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class MechanismPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public MechanismPolicy value;
	public MechanismPolicyHolder()
	{
	}
	public MechanismPolicyHolder (final MechanismPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MechanismPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MechanismPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MechanismPolicyHelper.write (_out,value);
	}
}
