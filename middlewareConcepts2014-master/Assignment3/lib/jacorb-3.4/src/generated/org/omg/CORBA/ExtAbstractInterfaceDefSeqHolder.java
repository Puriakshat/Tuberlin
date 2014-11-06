package org.omg.CORBA;

/**
 * Generated from IDL alias "ExtAbstractInterfaceDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtAbstractInterfaceDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExtAbstractInterfaceDef[] value;

	public ExtAbstractInterfaceDefSeqHolder ()
	{
	}
	public ExtAbstractInterfaceDefSeqHolder (final org.omg.CORBA.ExtAbstractInterfaceDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtAbstractInterfaceDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtAbstractInterfaceDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExtAbstractInterfaceDefSeqHelper.write (out,value);
	}
}
