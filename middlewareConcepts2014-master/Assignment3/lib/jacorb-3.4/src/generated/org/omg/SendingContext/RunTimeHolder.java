package org.omg.SendingContext;

/**
 * Generated from IDL interface "RunTime".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RunTimeHolder	implements org.omg.CORBA.portable.Streamable{
	 public RunTime value;
	public RunTimeHolder()
	{
	}
	public RunTimeHolder (final RunTime initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RunTimeHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RunTimeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RunTimeHelper.write (_out,value);
	}
}
