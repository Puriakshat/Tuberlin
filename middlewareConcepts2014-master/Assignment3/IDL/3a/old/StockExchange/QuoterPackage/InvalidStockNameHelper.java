package StockExchange.QuoterPackage;


/**
* StockExchange/QuoterPackage/InvalidStockNameHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Saturday, 24 May 2014 15:04:29 o'clock CEST
*/

abstract public class InvalidStockNameHelper
{
  private static String  _id = "IDL:StockExchange/Quoter/InvalidStockName:1.0";

  public static void insert (org.omg.CORBA.Any a, StockExchange.QuoterPackage.InvalidStockName that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static StockExchange.QuoterPackage.InvalidStockName extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (StockExchange.QuoterPackage.InvalidStockNameHelper.id (), "InvalidStockName", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static StockExchange.QuoterPackage.InvalidStockName read (org.omg.CORBA.portable.InputStream istream)
  {
    StockExchange.QuoterPackage.InvalidStockName value = new StockExchange.QuoterPackage.InvalidStockName ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, StockExchange.QuoterPackage.InvalidStockName value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
