package org.omg.CORBA;

/**
 * Generated from IDL alias "ExtAttrDescriptionSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ExtAttrDescriptionSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.ExtAttributeDescription[] value;

	public ExtAttrDescriptionSeqHolder ()
	{
	}
	public ExtAttrDescriptionSeqHolder (final org.omg.CORBA.ExtAttributeDescription[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtAttrDescriptionSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtAttrDescriptionSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExtAttrDescriptionSeqHelper.write (out,value);
	}
}
