package StockExchange;

/**
 * Generated from IDL struct "Quote".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public final class QuoteHolder
	implements org.omg.CORBA.portable.Streamable
{
	public StockExchange.Quote value;

	public QuoteHolder ()
	{
	}
	public QuoteHolder(final StockExchange.Quote initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StockExchange.QuoteHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = StockExchange.QuoteHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		StockExchange.QuoteHelper.write(_out, value);
	}
}
