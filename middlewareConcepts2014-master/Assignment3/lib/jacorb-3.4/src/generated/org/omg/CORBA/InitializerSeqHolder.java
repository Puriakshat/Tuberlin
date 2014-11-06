package org.omg.CORBA;

/**
 * Generated from IDL alias "InitializerSeq".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class InitializerSeqHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.Initializer[] value;

	public InitializerSeqHolder ()
	{
	}
	public InitializerSeqHolder (final org.omg.CORBA.Initializer[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InitializerSeqHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InitializerSeqHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InitializerSeqHelper.write (out,value);
	}
}
