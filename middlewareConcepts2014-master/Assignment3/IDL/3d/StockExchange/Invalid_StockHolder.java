package StockExchange;

/**
 * Generated from IDL exception "Invalid_Stock".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 02-Jun-2014 09:21:34
 */

public final class Invalid_StockHolder
	implements org.omg.CORBA.portable.Streamable
{
	public StockExchange.Invalid_Stock value;

	public Invalid_StockHolder ()
	{
	}
	public Invalid_StockHolder(final StockExchange.Invalid_Stock initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StockExchange.Invalid_StockHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = StockExchange.Invalid_StockHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		StockExchange.Invalid_StockHelper.write(_out, value);
	}
}
