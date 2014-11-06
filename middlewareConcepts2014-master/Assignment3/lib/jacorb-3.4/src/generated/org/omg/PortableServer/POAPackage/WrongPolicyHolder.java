package org.omg.PortableServer.POAPackage;

/**
 * Generated from IDL exception "WrongPolicy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class WrongPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableServer.POAPackage.WrongPolicy value;

	public WrongPolicyHolder ()
	{
	}
	public WrongPolicyHolder(final org.omg.PortableServer.POAPackage.WrongPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableServer.POAPackage.WrongPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableServer.POAPackage.WrongPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableServer.POAPackage.WrongPolicyHelper.write(_out, value);
	}
}
