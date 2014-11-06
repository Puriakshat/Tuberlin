package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL exception "BridgeInactive".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BridgeInactiveHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosBridgeAdmin.BridgeInactive value;

	public BridgeInactiveHolder ()
	{
	}
	public BridgeInactiveHolder(final org.omg.CosBridgeAdmin.BridgeInactive initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CosBridgeAdmin.BridgeInactiveHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CosBridgeAdmin.BridgeInactiveHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CosBridgeAdmin.BridgeInactiveHelper.write(_out, value);
	}
}
