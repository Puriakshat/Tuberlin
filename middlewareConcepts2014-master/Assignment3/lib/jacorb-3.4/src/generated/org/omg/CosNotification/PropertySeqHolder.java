package org.omg.CosNotification;

/**
 * Generated from IDL alias "PropertySeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PropertySeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.Property[] value;

	public PropertySeqHolder ()
	{
	}
	public PropertySeqHolder (final org.omg.CosNotification.Property[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertySeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertySeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertySeqHelper.write (out,value);
	}
}
