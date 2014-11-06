package org.omg.CORBA;

/**
 * Generated from IDL interface "OperationDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OperationDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public OperationDef value;
	public OperationDefHolder()
	{
	}
	public OperationDefHolder (final OperationDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return OperationDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OperationDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		OperationDefHelper.write (_out,value);
	}
}
