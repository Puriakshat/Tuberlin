package org.omg.CORBA;

/**
 * Generated from IDL interface "ArrayDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ArrayDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public ArrayDef value;
	public ArrayDefHolder()
	{
	}
	public ArrayDefHolder (final ArrayDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ArrayDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ArrayDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ArrayDefHelper.write (_out,value);
	}
}
