package org.omg.CosTrading;

/**
 * Generated from IDL interface "OfferIdIterator".
 *
 * @author JacORB IDL compiler V @project.version@
 * @version generated at 27-May-2014 20:14:30
 */

public final class OfferIdIteratorHolder	implements org.omg.CORBA.portable.Streamable{
	 public OfferIdIterator value;
	public OfferIdIteratorHolder()
	{
	}
	public OfferIdIteratorHolder (final OfferIdIterator initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return OfferIdIteratorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OfferIdIteratorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		OfferIdIteratorHelper.write (_out,value);
	}
}
