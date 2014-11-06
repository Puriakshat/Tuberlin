package org.omg.Security;
/**
 * Generated from IDL enum "RightsCombinator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class RightsCombinatorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public RightsCombinator value;

	public RightsCombinatorHolder ()
	{
	}
	public RightsCombinatorHolder (final RightsCombinator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RightsCombinatorHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RightsCombinatorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RightsCombinatorHelper.write (out,value);
	}
}
