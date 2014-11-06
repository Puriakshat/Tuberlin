package org.omg.CORBA;

/**
 * Generated from IDL alias "ExtInterfaceDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtInterfaceDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExtInterfaceDef[] value;

	public ExtInterfaceDefSeqHolder ()
	{
	}
	public ExtInterfaceDefSeqHolder (final org.omg.CORBA.ExtInterfaceDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtInterfaceDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtInterfaceDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExtInterfaceDefSeqHelper.write (out,value);
	}
}
