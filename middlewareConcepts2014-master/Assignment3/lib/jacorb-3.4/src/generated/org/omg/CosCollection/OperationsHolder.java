package org.omg.CosCollection;

/**
 * Generated from IDL interface "Operations".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OperationsHolder	implements org.omg.CORBA.portable.Streamable{
	 public Operations value;
	public OperationsHolder()
	{
	}
	public OperationsHolder (final Operations initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return OperationsHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OperationsHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		OperationsHelper.write (_out,value);
	}
}
