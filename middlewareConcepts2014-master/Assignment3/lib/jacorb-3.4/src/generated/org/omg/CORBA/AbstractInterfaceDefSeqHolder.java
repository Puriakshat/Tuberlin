package org.omg.CORBA;

/**
 * Generated from IDL alias "AbstractInterfaceDefSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class AbstractInterfaceDefSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.AbstractInterfaceDef[] value;

	public AbstractInterfaceDefSeqHolder ()
	{
	}
	public AbstractInterfaceDefSeqHolder (final org.omg.CORBA.AbstractInterfaceDef[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AbstractInterfaceDefSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AbstractInterfaceDefSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AbstractInterfaceDefSeqHelper.write (out,value);
	}
}
