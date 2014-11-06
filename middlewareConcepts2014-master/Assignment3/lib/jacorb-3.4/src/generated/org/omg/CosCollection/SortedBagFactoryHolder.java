package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedBagFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SortedBagFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedBagFactory value;
	public SortedBagFactoryHolder()
	{
	}
	public SortedBagFactoryHolder (final SortedBagFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedBagFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedBagFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedBagFactoryHelper.write (_out,value);
	}
}
