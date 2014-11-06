package StockExchange;


/**
* StockExchange/QuoterPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from stock.idl
* Wednesday, 28 May 2014 11:00:38 o'clock CEST
*/

public abstract class QuoterPOA extends org.omg.PortableServer.Servant
 implements StockExchange.QuoterOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getQuoteByName", new java.lang.Integer (0));
    _methods.put ("getQuoteByID", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // StockExchange/Quoter/getQuoteByName
       {
         try {
           String stockName = in.read_string ();
           float $result = (float)0;
           $result = this.getQuoteByName (stockName);
           out = $rh.createReply();
           out.write_float ($result);
         } catch (StockExchange.QuoterPackage.InvalidStockName $ex) {
           out = $rh.createExceptionReply ();
           StockExchange.QuoterPackage.InvalidStockNameHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // StockExchange/Quoter/getQuoteByID
       {
         try {
           String stockID = in.read_string ();
           float $result = (float)0;
           $result = this.getQuoteByID (stockID);
           out = $rh.createReply();
           out.write_float ($result);
         } catch (StockExchange.QuoterPackage.InvalidStockID $ex) {
           out = $rh.createExceptionReply ();
           StockExchange.QuoterPackage.InvalidStockIDHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:StockExchange/Quoter:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Quoter _this() 
  {
    return QuoterHelper.narrow(
    super._this_object());
  }

  public Quoter _this(org.omg.CORBA.ORB orb) 
  {
    return QuoterHelper.narrow(
    super._this_object(orb));
  }


} // class QuoterPOA
