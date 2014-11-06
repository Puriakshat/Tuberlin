package org.omg.PortableServer;

/**
 * Generated from IDL interface "ServantRetentionPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ServantRetentionPolicyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ServantRetentionPolicy value;
	public ServantRetentionPolicyHolder()
	{
	}
	public ServantRetentionPolicyHolder (final ServantRetentionPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ServantRetentionPolicyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServantRetentionPolicyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ServantRetentionPolicyHelper.write (_out,value);
	}
}
