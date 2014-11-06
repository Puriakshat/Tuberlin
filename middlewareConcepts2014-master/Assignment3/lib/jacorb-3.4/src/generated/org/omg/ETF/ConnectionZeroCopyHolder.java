package org.omg.ETF;

/**
 * Generated from IDL interface "ConnectionZeroCopy".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ConnectionZeroCopyHolder	implements org.omg.CORBA.portable.Streamable{
	 public ConnectionZeroCopy value;
	public ConnectionZeroCopyHolder()
	{
	}
	public ConnectionZeroCopyHolder (final ConnectionZeroCopy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ConnectionZeroCopyHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectionZeroCopyHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ConnectionZeroCopyHelper.write (_out,value);
	}
}
