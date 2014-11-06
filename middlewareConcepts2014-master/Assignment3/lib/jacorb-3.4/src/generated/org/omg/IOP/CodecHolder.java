package org.omg.IOP;

/**
 * Generated from IDL interface "Codec".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CodecHolder	implements org.omg.CORBA.portable.Streamable{
	 public Codec value;
	public CodecHolder()
	{
	}
	public CodecHolder (final Codec initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CodecHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CodecHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CodecHelper.write (_out,value);
	}
}
