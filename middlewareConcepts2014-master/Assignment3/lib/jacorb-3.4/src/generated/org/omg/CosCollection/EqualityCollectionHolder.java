package org.omg.CosCollection;

/**
 * Generated from IDL interface "EqualityCollection".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class EqualityCollectionHolder	implements org.omg.CORBA.portable.Streamable{
	 public EqualityCollection value;
	public EqualityCollectionHolder()
	{
	}
	public EqualityCollectionHolder (final EqualityCollection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EqualityCollectionHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EqualityCollectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EqualityCollectionHelper.write (_out,value);
	}
}
