package org.omg.PortableServer;

/**
 * Generated from IDL interface "LifespanPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class LifespanPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public LifespanPolicy value;
	public LifespanPolicyHolder()
	{
	}
	public LifespanPolicyHolder (final LifespanPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return LifespanPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LifespanPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		LifespanPolicyHelper.write (_out,value);
	}
}
