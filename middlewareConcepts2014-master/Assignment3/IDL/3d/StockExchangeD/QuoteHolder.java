package StockExchangeD;

/**
 * Generated from IDL struct "Quote".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 03-Jun-2014 08:18:59
 */

public final class QuoteHolder
	implements org.omg.CORBA.portable.Streamable
{
	public StockExchangeD.Quote value;

	public QuoteHolder ()
	{
	}
	public QuoteHolder(final StockExchangeD.Quote initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StockExchangeD.QuoteHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = StockExchangeD.QuoteHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		StockExchangeD.QuoteHelper.write(_out, value);
	}
}
