package org.omg.PortableInterceptor;

/**
 * Generated from IDL alias "ObjectReferenceTemplateSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class ObjectReferenceTemplateSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.PortableInterceptor.ObjectReferenceTemplate[] value;

	public ObjectReferenceTemplateSeqHolder ()
	{
	}
	public ObjectReferenceTemplateSeqHolder (final org.omg.PortableInterceptor.ObjectReferenceTemplate[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectReferenceTemplateSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectReferenceTemplateSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectReferenceTemplateSeqHelper.write (out,value);
	}
}
