package org.omg.CORBA;

/**
 * Generated from IDL interface "StringDef".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StringDefHolder	implements org.omg.CORBA.portable.Streamable{
	 public StringDef value;
	public StringDefHolder()
	{
	}
	public StringDefHolder (final StringDef initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StringDefHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StringDefHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StringDefHelper.write (_out,value);
	}
}
