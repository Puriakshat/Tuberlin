package org.omg.CosBridgeAdmin;

/**
 * Generated from IDL interface "Bridge".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BridgeHolder	implements org.omg.CORBA.portable.Streamable{
	 public Bridge value;
	public BridgeHolder()
	{
	}
	public BridgeHolder (final Bridge initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BridgeHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BridgeHelper.write (_out,value);
	}
}
