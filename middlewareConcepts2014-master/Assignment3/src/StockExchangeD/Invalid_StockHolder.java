package StockExchangeD;

/**
 * Generated from IDL exception "Invalid_Stock".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at 03-Jun-2014 08:18:59
 */

public final class Invalid_StockHolder
	implements org.omg.CORBA.portable.Streamable
{
	public StockExchangeD.Invalid_Stock value;

	public Invalid_StockHolder ()
	{
	}
	public Invalid_StockHolder(final StockExchangeD.Invalid_Stock initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StockExchangeD.Invalid_StockHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = StockExchangeD.Invalid_StockHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		StockExchangeD.Invalid_StockHelper.write(_out, value);
	}
}
