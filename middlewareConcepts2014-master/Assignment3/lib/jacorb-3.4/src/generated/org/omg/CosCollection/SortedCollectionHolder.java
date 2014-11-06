package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SortedCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedCollection value;
	public SortedCollectionHolder()
	{
	}
	public SortedCollectionHolder (final SortedCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedCollectionHelper.write (_out,value);
	}
}
