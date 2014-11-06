package org.omg.CosCollection;

/**
 * Generated from IDL interface "BagFactory".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class BagFactoryHolder	implements org.omg.CORBA.portable.Streamable{
	 public BagFactory value;
	public BagFactoryHolder()
	{
	}
	public BagFactoryHolder (final BagFactory initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return BagFactoryHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BagFactoryHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BagFactoryHelper.write (_out,value);
	}
}
