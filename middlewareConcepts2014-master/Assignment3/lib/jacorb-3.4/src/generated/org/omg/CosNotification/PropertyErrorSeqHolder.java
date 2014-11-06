package org.omg.CosNotification;

/**
 * Generated from IDL alias "PropertyErrorSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class PropertyErrorSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.PropertyError[] value;

	public PropertyErrorSeqHolder ()
	{
	}
	public PropertyErrorSeqHolder (final org.omg.CosNotification.PropertyError[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PropertyErrorSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PropertyErrorSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PropertyErrorSeqHelper.write (out,value);
	}
}
