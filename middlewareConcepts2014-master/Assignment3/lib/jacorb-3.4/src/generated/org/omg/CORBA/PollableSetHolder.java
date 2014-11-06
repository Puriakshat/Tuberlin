package org.omg.CORBA;

/**
 * Generated from IDL interface "PollableSet".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PollableSetHolder	implements org.omg.CORBA.portable.Streamable{
	 public PollableSet value;
	public PollableSetHolder()
	{
	}
	public PollableSetHolder (final PollableSet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PollableSetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PollableSetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PollableSetHelper.write (_out,value);
	}
}
