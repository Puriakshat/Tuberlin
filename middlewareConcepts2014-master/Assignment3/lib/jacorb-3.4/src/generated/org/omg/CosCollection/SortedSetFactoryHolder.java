package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedSetFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SortedSetFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedSetFactory value;
	public SortedSetFactoryHolder()
	{
	}
	public SortedSetFactoryHolder (final SortedSetFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedSetFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedSetFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedSetFactoryHelper.write (_out,value);
	}
}
