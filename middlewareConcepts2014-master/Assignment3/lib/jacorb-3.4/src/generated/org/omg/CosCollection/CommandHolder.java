package org.omg.CosCollection;

/**
 * Generated from IDL interface "Command".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CommandHolder	implements org.omg.CORBA.portable.Streamable{
	 public Command value;
	public CommandHolder()
	{
	}
	public CommandHolder (final Command initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CommandHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CommandHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CommandHelper.write (_out,value);
	}
}
