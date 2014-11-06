package org.omg.CosTrading;
/**
 * Generated from IDL enum "FollowOption".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class FollowOptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public FollowOption value;

	public FollowOptionHolder ()
	{
	}
	public FollowOptionHolder (final FollowOption initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FollowOptionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FollowOptionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FollowOptionHelper.write (out,value);
	}
}
