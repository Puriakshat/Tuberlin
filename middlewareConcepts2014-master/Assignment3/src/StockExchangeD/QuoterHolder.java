package StockExchangeD;

/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 03-Jun-2014 08:18:59
 */

public final class QuoterHolder	implements org.omg.CORBA.portable.Streamable{
	 public Quoter value;
	public QuoterHolder()
	{
	}
	public QuoterHolder (final Quoter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QuoterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QuoterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QuoterHelper.write (_out,value);
	}
}
