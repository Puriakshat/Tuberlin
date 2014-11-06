package org.omg.PortableGroup;

/**
 * Generated from IDL exception "CannotMeetCriteria".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CannotMeetCriteriaHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableGroup.CannotMeetCriteria value;

	public CannotMeetCriteriaHolder ()
	{
	}
	public CannotMeetCriteriaHolder(final org.omg.PortableGroup.CannotMeetCriteria initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.PortableGroup.CannotMeetCriteriaHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.PortableGroup.CannotMeetCriteriaHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.PortableGroup.CannotMeetCriteriaHelper.write(_out, value);
	}
}
