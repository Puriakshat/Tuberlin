package StockExchange;

/**
* StockExchange/QuoterHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Wednesday, 28 May 2014 11:00:38 o'clock CEST
*/

public final class QuoterHolder implements org.omg.CORBA.portable.Streamable
{
  public StockExchange.Quoter value = null;

  public QuoterHolder ()
  {
  }

  public QuoterHolder (StockExchange.Quoter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StockExchange.QuoterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StockExchange.QuoterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StockExchange.QuoterHelper.type ();
  }

}
