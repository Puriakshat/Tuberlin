package org.omg.PortableServer;

/**
 * Generated from IDL interface "POAManager".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class POAManagerHolder	implements org.omg.CORBA.portable.Streamable{
	 public POAManager value;
	public POAManagerHolder()
	{
	}
	public POAManagerHolder (final POAManager initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return POAManagerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = POAManagerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		POAManagerHelper.write (_out,value);
	}
}
