package org.omg.CosTrading;

/**
 * Generated from IDL interface "OfferIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OfferIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public OfferIterator value;
	public OfferIteratorHolder()
	{
	}
	public OfferIteratorHolder (final OfferIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return OfferIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OfferIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		OfferIteratorHelper.write (_out,value);
	}
}
