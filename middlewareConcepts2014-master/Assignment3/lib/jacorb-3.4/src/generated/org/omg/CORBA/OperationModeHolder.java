package org.omg.CORBA;
/**
 * Generated from IDL enum "OperationMode".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OperationModeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public OperationMode value;

	public OperationModeHolder ()
	{
	}
	public OperationModeHolder (final OperationMode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OperationModeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OperationModeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OperationModeHelper.write (out,value);
	}
}
