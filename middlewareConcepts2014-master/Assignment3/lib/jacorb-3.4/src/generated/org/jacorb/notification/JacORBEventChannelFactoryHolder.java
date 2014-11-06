package org.jacorb.notification;

/**
 * Generated from IDL interface "JacORBEventChannelFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class JacORBEventChannelFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public JacORBEventChannelFactory value;
	public JacORBEventChannelFactoryHolder()
	{
	}
	public JacORBEventChannelFactoryHolder (final JacORBEventChannelFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return JacORBEventChannelFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = JacORBEventChannelFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		JacORBEventChannelFactoryHelper.write (_out,value);
	}
}
