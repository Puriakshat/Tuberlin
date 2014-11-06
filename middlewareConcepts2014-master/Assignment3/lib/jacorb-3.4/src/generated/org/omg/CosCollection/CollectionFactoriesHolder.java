package org.omg.CosCollection;

/**
 * Generated from IDL interface "CollectionFactories".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class CollectionFactoriesHolder	implements org.omg.CORBA.portable.Streamable{
	 public CollectionFactories value;
	public CollectionFactoriesHolder()
	{
	}
	public CollectionFactoriesHolder (final CollectionFactories initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionFactoriesHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionFactoriesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionFactoriesHelper.write (_out,value);
	}
}
