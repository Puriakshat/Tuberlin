package org.omg.CORBA;

/**
 * Generated from IDL alias "ExtLocalInterfaceDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtLocalInterfaceDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExtLocalInterfaceDef[] value;

	public ExtLocalInterfaceDefSeqHolder ()
	{
	}
	public ExtLocalInterfaceDefSeqHolder (final org.omg.CORBA.ExtLocalInterfaceDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtLocalInterfaceDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtLocalInterfaceDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExtLocalInterfaceDefSeqHelper.write (out,value);
	}
}
