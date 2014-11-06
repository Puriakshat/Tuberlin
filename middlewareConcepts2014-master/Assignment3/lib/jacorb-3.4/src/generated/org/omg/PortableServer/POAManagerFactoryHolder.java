package org.omg.PortableServer;

/**
 * Generated from IDL interface "POAManagerFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class POAManagerFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public POAManagerFactory value;
	public POAManagerFactoryHolder()
	{
	}
	public POAManagerFactoryHolder (final POAManagerFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return POAManagerFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = POAManagerFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		POAManagerFactoryHelper.write (_out,value);
	}
}
