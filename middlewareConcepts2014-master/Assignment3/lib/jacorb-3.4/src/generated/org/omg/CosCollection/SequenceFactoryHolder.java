package org.omg.CosCollection;

/**
 * Generated from IDL interface "SequenceFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SequenceFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public SequenceFactory value;
	public SequenceFactoryHolder()
	{
	}
	public SequenceFactoryHolder (final SequenceFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SequenceFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SequenceFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SequenceFactoryHelper.write (_out,value);
	}
}
