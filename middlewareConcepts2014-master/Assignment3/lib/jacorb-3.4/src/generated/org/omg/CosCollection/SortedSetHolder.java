package org.omg.CosCollection;

/**
 * Generated from IDL interface "SortedSet".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class SortedSetHolder	implements org.omg.CORBA.portable.Streamable{
	 public SortedSet value;
	public SortedSetHolder()
	{
	}
	public SortedSetHolder (final SortedSet initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SortedSetHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SortedSetHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SortedSetHelper.write (_out,value);
	}
}
