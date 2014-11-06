package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualitySequence".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EqualitySequenceHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualitySequence value;
	public EqualitySequenceHolder()
	{
	}
	public EqualitySequenceHolder (final EqualitySequence initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualitySequenceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualitySequenceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualitySequenceHelper.write (_out,value);
	}
}
