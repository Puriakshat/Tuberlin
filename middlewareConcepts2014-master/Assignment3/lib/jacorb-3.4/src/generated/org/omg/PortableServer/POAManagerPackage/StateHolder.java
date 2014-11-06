package org.omg.PortableServer.POAManagerPackage;
/**
 * Generated from IDL enum "State".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class StateHolder
	implements org.omg.CORBA.portable.Streamable
{
	public State value;

	public StateHolder ()
	{
	}
	public StateHolder (final State initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StateHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StateHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StateHelper.write (out,value);
	}
}
