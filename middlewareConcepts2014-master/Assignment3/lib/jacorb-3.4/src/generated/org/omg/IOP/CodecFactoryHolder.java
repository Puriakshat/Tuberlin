package org.omg.IOP;

/**
 * Generated from IDL interface "CodecFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CodecFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public CodecFactory value;
	public CodecFactoryHolder()
	{
	}
	public CodecFactoryHolder (final CodecFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CodecFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CodecFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CodecFactoryHelper.write (_out,value);
	}
}
